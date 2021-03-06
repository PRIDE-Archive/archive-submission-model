package uk.ac.ebi.pride.archive.submission.model.submission;

/**
 * Different upload method
 *
 * @author Rui Wang
 * @version $Id$
 */
public enum UploadMethod {
  FTP("ftp"),
  ASPERA("aspera");

  private String method;

  UploadMethod(String method) {
    this.method = method;
  }

  public static UploadMethod findMethod(String method) {
    for (UploadMethod uploadMethod : UploadMethod.values()) {
      if (uploadMethod.getMethod().equalsIgnoreCase(method)) {
        return uploadMethod;
      }
    }

    return null;
  }

  public String getMethod() {
    return method;
  }
}
