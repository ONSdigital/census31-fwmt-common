package uk.gov.ons.census.fwmt.common.messaging;

/**
 * Shared property keys for Pub/Sub messaging (FMT-47).
 */
public final class MessagingProperties {

  public static final String PROVIDER = "app.messaging.provider";
  public static final String PROVIDER_PUBSUB = "pubsub";

  private MessagingProperties() {
  }
}
