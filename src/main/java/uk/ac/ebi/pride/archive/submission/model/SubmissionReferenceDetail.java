package uk.ac.ebi.pride.archive.submission.model;

import java.io.Serializable;

/**
 * The receipt given as the result of a submission
 *
 * @author Rui Wang
 * @version $Id$
 */
public class SubmissionReferenceDetail implements Serializable {
    private String reference;

    public SubmissionReferenceDetail() {
    }

    public SubmissionReferenceDetail(String reference) {
        this.reference = reference;
    }

    public String getReference() {
        return reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SubmissionReferenceDetail)) return false;

        SubmissionReferenceDetail that = (SubmissionReferenceDetail) o;

        if (reference != null ? !reference.equals(that.reference) : that.reference != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return reference != null ? reference.hashCode() : 0;
    }
}
