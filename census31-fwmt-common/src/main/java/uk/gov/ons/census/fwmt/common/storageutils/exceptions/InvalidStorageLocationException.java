package uk.gov.ons.census.fwmt.common.storageutils.exceptions;

@SuppressWarnings("serial")
public class InvalidStorageLocationException extends RuntimeException {

  public InvalidStorageLocationException(String folderLocation, Exception e) {
    super(folderLocation, e);
  }

}
