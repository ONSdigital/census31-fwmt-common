package uk.gov.ons.census.fwmt.common.messaging;

/**
 * Messaging backend selected for a service ({@code app.messaging.provider}).
 */
public enum MessagingProvider {
  RABBIT,
  PUBSUB
}
