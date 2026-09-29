package uk.gov.ons.census.fwmt.common.dto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
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
  public void rmPausePayloadRoundTripsWithRequiredFields() throws Exception {
    String pauseFrom = "2026-09-29T12:00:00Z";
    ActionInstruction instruction = ActionInstruction.builder()
        .actionInstruction(ActionInstructionType.PAUSE)
        .surveyName("CENSUS")
        .caseId("case-456")
        .addressType("HH")
        .addressLevel("U")
        .pauseCode("HOLD")
        .pauseFrom(pauseFrom)
        .build();

    String json = objectMapper.writeValueAsString(instruction);
    JsonNode payload = objectMapper.readTree(json);

    assertEquals("PAUSE", payload.get("actionInstruction").asText());
    assertEquals("CENSUS", payload.get("surveyName").asText());
    assertEquals("case-456", payload.get("caseId").asText());
    assertEquals("HH", payload.get("addressType").asText());
    assertEquals("U", payload.get("addressLevel").asText());
    assertEquals("HOLD", payload.get("pauseCode").asText());
    assertEquals(pauseFrom, payload.get("pauseFrom").asText());

    ActionInstruction decoded = objectMapper.readValue(json, ActionInstruction.class);
    assertEquals(ActionInstructionType.PAUSE, decoded.getActionInstruction());
    assertEquals("case-456", decoded.getCaseId());
    assertEquals("HOLD", decoded.getPauseCode());
    assertEquals(pauseFrom, decoded.getPauseFrom());
    assertTrue(payload.get("pauseFrom").isTextual());
  }
}
