package uk.ac.ebi.pride.archive.submission.model.project;

import java.io.Serializable;

/**
 * Project summary details
 *
 * @author Rui Wang
 * @version $Id$
 */
public class ProjectDetail implements Serializable {
    private String accession;

    public ProjectDetail() {
    }

    public ProjectDetail(String accession) {
        this.accession = accession;
    }

    public String getAccession() {
        return accession;
    }

    public void setAccession(String accession) {
        this.accession = accession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProjectDetail)) return false;

        ProjectDetail that = (ProjectDetail) o;

        if (!accession.equals(that.accession)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return accession.hashCode();
    }
}
