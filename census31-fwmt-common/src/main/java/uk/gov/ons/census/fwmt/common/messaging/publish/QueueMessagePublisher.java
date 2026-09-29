package uk.gov.ons.census.fwmt.common.messaging.publish;

/**
 * Publishes directly to a queue or topic destination.
 */
public interface QueueMessagePublisher {

  void publish(String destination, Object payload);
}
