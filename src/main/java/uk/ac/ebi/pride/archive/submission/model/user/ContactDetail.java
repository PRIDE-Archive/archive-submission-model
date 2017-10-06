package uk.ac.ebi.pride.archive.submission.model.user;


import uk.ac.ebi.pride.archive.dataprovider.person.Title;

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
    private String country;
    private String orcid;

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

    public ContactDetail(String email,
                         Title title,
                         String firstName,
                         String lastName,
                         String affiliation,
                         String country,
                         String orcid) {
        this(email, title, firstName, lastName, affiliation);
        this.country = country;
        this.orcid = orcid;
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
        if(this.country != null) {
            if(!this.country.equals(that.country)) {
                return false;
            }
        } else if(that.country != null) {
            return false;
        }

        if(this.orcid != null) {
            if(!this.orcid.equals(that.orcid)) {
                return false;
            }
        } else if(that.orcid != null) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        int result = email.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + affiliation.hashCode();
        result = 31 * result + (this.country != null?this.country.hashCode():0);
        result = 31 * result + (this.orcid != null?this.orcid.hashCode():0);
        return result;
    }

    /**
     * Sets new country.
     *
     * @param country New value of country.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * Gets country.
     *
     * @return Value of country.
     */
    public String getCountry() {
        return country;
    }

    /**
     * Gets orcid.
     *
     * @return Value of orcid.
     */
    public String getOrcid() {
        return orcid;
    }

    /**
     * Sets new orcid.
     *
     * @param orcid New value of orcid.
     */
    public void setOrcid(String orcid) {
        this.orcid = orcid;
    }
}
