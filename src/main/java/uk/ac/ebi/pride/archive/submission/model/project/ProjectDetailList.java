package uk.ac.ebi.pride.archive.submission.model.project;

import uk.ac.ebi.pride.archive.submission.model.util.CollectionUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * A list of project details
 *
 * @author Rui Wang
 * @version $Id$
 */
public class ProjectDetailList implements Serializable {

  private final List<ProjectDetail> projectDetails;

  public ProjectDetailList() {
    this.projectDetails = new ArrayList<ProjectDetail>();
  }

  public ProjectDetailList(Collection<ProjectDetail> projectDetails) {
    this.projectDetails = CollectionUtils.createListFromList(projectDetails);
  }

  public List<ProjectDetail> getProjectDetails() {
    return projectDetails;
  }

  public void setProjectDetails(List<ProjectDetail> projectDetails) {
    CollectionUtils.replaceValuesInCollection(projectDetails, this.projectDetails);
  }

  public void addProjectDetail(ProjectDetail projectDetail) {
    this.projectDetails.add(projectDetail);
  }

  public ProjectDetail getProjectDetailByAccession(String accession) {
    for (ProjectDetail projectDetail : projectDetails) {
      if (projectDetail.getAccession().equalsIgnoreCase(accession)) {
        return projectDetail;
      }
    }

    return null;
  }
}
