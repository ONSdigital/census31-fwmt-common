package uk.gov.ons.census.fwmt.common.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.time.Instant;
import org.junit.Test;
import uk.gov.ons.census.fwmt.common.dto.fwmt.PauseActionInstruction;
import uk.gov.ons.census.fwmt.common.dto.rm.ActionInstruction;
import uk.gov.ons.census.fwmt.common.dto.rm.ActionInstructionType;

public class ActionInstructionPayloadTest {

  private final ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();

  @Test
  public void rmActionInstructionRoundTripsWithoutChangingPayloadFields() throws Exception {
    ActionInstruction instruction = ActionInstruction.builder()
        .actionInstruction(ActionInstructionType.CREATE)
        .surveyName("CENSUS")
        .caseId("case-123")
        .addressType("HH")
        .build();

    String json = objectMapper.writeValueAsString(instruction);
    JsonNode payload = objectMapper.readTree(json);

    assertEquals("CREATE", payload.get("actionInstruction").asText());
    assertEquals("CENSUS", payload.get("surveyName").asText());
    assertEquals("case-123", payload.get("caseId").asText());
    assertEquals("HH", payload.get("addressType").asText());
    assertFalse(payload.has("addressLevel"));

    ActionInstruction decoded = objectMapper.readValue(json, ActionInstruction.class);
    assertEquals(ActionInstructionType.CREATE, decoded.getActionInstruction());
    assertEquals("case-123", decoded.getCaseId());
    assertEquals("HH", decoded.getAddressType());
    assertEquals(null, decoded.getAddressLevel());
  }

  @Test
  public void fwmtPauseInstructionRoundTripsWithItsExistingNullHandling() throws Exception {
    Instant pauseFrom = Instant.parse("2026-09-29T12:00:00Z");
    PauseActionInstruction instruction = PauseActionInstruction.builder()
        .actionInstruction("PAUSE")
        .surveyName("CENSUS")
        .caseId("case-456")
        .pauseCode("HOLD")
        .pauseFrom(pauseFrom)
        .build();

    String json = objectMapper.writeValueAsString(instruction);
    JsonNode payload = objectMapper.readTree(json);

    assertEquals("PAUSE", payload.get("actionInstruction").asText());
    assertEquals("case-456", payload.get("caseId").asText());
    assertEquals("HOLD", payload.get("pauseCode").asText());
    assertTrue(payload.has("addressLevel"));
    assertTrue(payload.get("addressLevel").isNull());

    PauseActionInstruction decoded = objectMapper.readValue(json, PauseActionInstruction.class);
    assertEquals("PAUSE", decoded.getActionInstruction());
    assertEquals("case-456", decoded.getCaseId());
    assertEquals(pauseFrom, decoded.getPauseFrom());
    assertEquals(null, decoded.getAddressLevel());
  }
}
