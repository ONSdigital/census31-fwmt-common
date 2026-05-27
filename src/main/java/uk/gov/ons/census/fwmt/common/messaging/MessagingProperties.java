package uk.gov.ons.census.fwmt.common.messaging;

/**
 * Shared property keys for Rabbit / Pub/Sub selection (Stage 1 abstraction).
 */
public final class MessagingProperties {

  public static final String PROVIDER = "app.messaging.provider";
  public static final String PROVIDER_RABBIT = "rabbit";
  public static final String PROVIDER_PUBSUB = "pubsub";

  private MessagingProperties() {
  }
}
