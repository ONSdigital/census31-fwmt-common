package uk.gov.ons.census.fwmt.common.events.producer;

import uk.gov.ons.census.fwmt.common.events.data.GatewayErrorEventDTO;
import uk.gov.ons.census.fwmt.common.events.data.GatewayEventDTO;

public interface GatewayEventProducer {
  public static final String INVALID_ERROR_TYPE = "Invalid Error Type";
  
  void sendEvent(GatewayEventDTO event);

  void sendErrorEvent(GatewayErrorEventDTO errorEvent);
}
