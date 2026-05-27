package uk.gov.ons.census.fwmt.common.messaging.publish;

/**
 * Publishes to a named exchange with a routing key (GW-style Rabbit topology).
 */
public interface ExchangeMessagePublisher {

  void publish(String exchange, String routingKey, Object payload);
}
