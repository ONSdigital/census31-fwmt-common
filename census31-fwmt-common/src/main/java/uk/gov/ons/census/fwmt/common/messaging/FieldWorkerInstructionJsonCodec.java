package uk.gov.ons.census.fwmt.common.messaging;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.PubsubMessage;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import uk.gov.ons.census.fwmt.common.rm.dto.FwmtActionInstruction;
import uk.gov.ons.census.fwmt.common.rm.dto.FwmtCancelActionInstruction;

/**
 * JSON codec aligned with job-service {@code Jackson2JsonMessageConverter} type ids for RM/GW field lanes.
 */
public final class FieldWorkerInstructionJsonCodec {

  public static final String TYPE_ID_HEADER = "__TypeId__";
  public static final String TIMESTAMP_HEADER = "timestamp";

  private final ObjectMapper objectMapper;
  private final Map<String, Class<?>> typeIds;

  public FieldWorkerInstructionJsonCodec() {
    objectMapper = new ObjectMapper();
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    typeIds = fieldWorkerInstructionTypeIds();
  }

  public PubsubMessage toPubsubMessage(Object payload, boolean withTimestamp) {
    try {
      String typeId = payload.getClass().getName();
      String json = objectMapper.writeValueAsString(payload);
      PubsubMessage.Builder builder = PubsubMessage.newBuilder()
          .setData(ByteString.copyFromUtf8(json))
          .putAttributes(TYPE_ID_HEADER, typeId);
      if (withTimestamp) {
        builder.putAttributes(TIMESTAMP_HEADER, String.valueOf(System.currentTimeMillis()));
      }
      return builder.build();
    } catch (IOException e) {
      throw new IllegalStateException("Failed to encode field worker instruction message", e);
    }
  }

  public Object fromPubsubMessage(PubsubMessage message) {
    String typeId = message.getAttributesOrDefault(TYPE_ID_HEADER, "");
    if (typeId.isEmpty()) {
      throw new IllegalStateException("Missing " + TYPE_ID_HEADER + " attribute on Pub/Sub message");
    }
    Class<?> type = typeIds.get(typeId);
    if (type == null) {
      throw new IllegalStateException("Unknown field worker instruction type id: " + typeId);
    }
    try {
      return objectMapper.readValue(message.getData().toStringUtf8(), type);
    } catch (IOException e) {
      throw new IllegalStateException("Failed to decode field worker instruction message", e);
    }
  }

  private static Map<String, Class<?>> fieldWorkerInstructionTypeIds() {
    Map<String, Class<?>> idClassMapping = new HashMap<>();
    idClassMapping.put("uk.gov.ons.census.fwmtadapter.model.dto.fwmt.FwmtActionInstruction", FwmtActionInstruction.class);
    idClassMapping.put("uk.gov.ons.census.fwmtadapter.model.dto.fwmt.FwmtCancelActionInstruction",
        FwmtCancelActionInstruction.class);
    idClassMapping.put(FwmtActionInstruction.class.getName(), FwmtActionInstruction.class);
    idClassMapping.put(FwmtCancelActionInstruction.class.getName(), FwmtCancelActionInstruction.class);
    return idClassMapping;
  }
}
