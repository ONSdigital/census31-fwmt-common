package uk.gov.ons.census.fwmt.common.messaging.publish;

/**
 * Publishes directly to a queue / topic name (RM.Field-style lanes).
 */
public interface QueueMessagePublisher {

  void publish(String destination, Object payload);
}
