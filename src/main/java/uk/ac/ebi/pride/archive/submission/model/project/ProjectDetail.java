package uk.ac.ebi.pride.archive.submission.model.project;

import uk.ac.ebi.pride.archive.dataprovider.utils.SubmissionTypeConstants;

import java.io.Serializable;

/**
 * Project summary details
 *
 * @author Rui Wang
 * @version $Id$
 */
public class ProjectDetail implements Serializable {
  private String accession;
  private SubmissionTypeConstants submissionType;

  public ProjectDetail() {}

  public ProjectDetail(String accession, SubmissionTypeConstants submissionType) {
    this.accession = accession;
    this.submissionType = submissionType;
  }

  public String getAccession() {
    return accession;
  }

  public void setAccession(String accession) {
    this.accession = accession;
  }

  public SubmissionTypeConstants getSubmissionType() {
    return submissionType;
  }

  public void setSubmissionType(SubmissionTypeConstants submissionType) {
    this.submissionType = submissionType;
  }
}
