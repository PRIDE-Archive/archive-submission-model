package uk.ac.ebi.pride.archive.submission.model.user;

import uk.ac.ebi.pride.prider.dataprovider.person.Title;

import java.io.Serializable;

/**
 * Contact details of a user
 *
 * @author Rui Wang
 * @version $Id$
 */
public class ContactDetail implements Serializable {
    private String email;
    private Title title;
    private String firstName;
    private String lastName;
    private String affiliation;

    public ContactDetail() {
    }

    public ContactDetail(String email,
                         Title title,
                         String firstName,
                         String lastName,
                         String affiliation) {
        this.email = email;
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
        this.affiliation = affiliation;
    }

    public String getEmail() {
        return email;
    }

    public Title getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContactDetail)) return false;

        ContactDetail that = (ContactDetail) o;

        if (!affiliation.equals(that.affiliation)) return false;
        if (!email.equals(that.email)) return false;
        if (!firstName.equals(that.firstName)) return false;
        if (!lastName.equals(that.lastName)) return false;
        if (title != that.title) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + affiliation.hashCode();
        return result;
    }
}
