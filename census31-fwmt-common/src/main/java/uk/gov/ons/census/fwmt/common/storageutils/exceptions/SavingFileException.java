package uk.gov.ons.census.fwmt.common.storageutils.exceptions;

@SuppressWarnings("serial")
public class SavingFileException extends RuntimeException {

  public SavingFileException(String folderLocation, Exception e) {
    super(folderLocation, e);
  }

}
