package uk.gov.ons.census.fwmt.common.storageutils.exceptions;

@SuppressWarnings("serial")
public class StorageInputStreamException extends RuntimeException {

  public StorageInputStreamException(String message, Exception e) {
    super(message, e);
  }

}
