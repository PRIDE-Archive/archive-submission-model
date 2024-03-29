package uk.ac.ebi.pride.archive.submission.model.user;

import uk.ac.ebi.pride.archive.dataprovider.utils.TitleConstants;

import java.io.Serializable;
import java.util.Date;

/**
 * Contact details of a user
 *
 * @author Rui Wang
 * @version $Id$
 */
public class ContactDetail implements Serializable {
  private String email;
  private TitleConstants title;
  private String firstName;
  private String lastName;
  private String affiliation;
  private String country;
  private String orcid;
  private Boolean acceptedTermsOfUse;
  private Date acceptedTermsOfUseAt;

  public ContactDetail() {}

  public ContactDetail(
          String email, TitleConstants title, String firstName, String lastName, String affiliation) {
    this.email = email;
    this.title = title;
    this.firstName = firstName;
    this.lastName = lastName;
    this.affiliation = affiliation;
  }

  public ContactDetail(
      String email,
      TitleConstants title,
      String firstName,
      String lastName,
      String affiliation,
      String country,
      String orcid,
      Boolean acceptedTermsOfUse) {
    this(email, title, firstName, lastName, affiliation);
    this.country = country;
    this.orcid = orcid;
    this.acceptedTermsOfUse = acceptedTermsOfUse;
  }

  public ContactDetail(
      String email,
      TitleConstants title,
      String firstName,
      String lastName,
      String affiliation,
      String country,
      String orcid,
      Boolean acceptedTermsOfUse,
      Date acceptedTermsOfUseAt) {
    this(email, title, firstName, lastName, affiliation, country, orcid, acceptedTermsOfUse);
    this.acceptedTermsOfUseAt = acceptedTermsOfUseAt;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public TitleConstants getTitle() {
    return title;
  }

  public void setTitle(TitleConstants title) {
    this.title = title;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getAffiliation() {
    return affiliation;
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
    if (this.country != null) {
      if (!this.country.equals(that.country)) {
        return false;
      }
    } else if (that.country != null) {
      return false;
    }

    if (this.orcid != null) {
      if (!this.orcid.equals(that.orcid)) {
        return false;
      }
    } else if (that.orcid != null) {
      return false;
    }

    if (this.acceptedTermsOfUse != null) {
      if (!this.acceptedTermsOfUse.equals(that.acceptedTermsOfUse)) {
        return false;
      }
    } else if (that.acceptedTermsOfUse != null) {
      return false;
    }

    if (this.acceptedTermsOfUseAt != null) {
      return this.acceptedTermsOfUseAt.equals(that.acceptedTermsOfUseAt);
    } else return that.acceptedTermsOfUseAt == null;
  }

  @Override
  public int hashCode() {
    int result = email.hashCode();
    result = 31 * result + title.hashCode();
    result = 31 * result + firstName.hashCode();
    result = 31 * result + lastName.hashCode();
    result = 31 * result + affiliation.hashCode();
    result = 31 * result + (this.country != null ? this.country.hashCode() : 0);
    result = 31 * result + (this.orcid != null ? this.orcid.hashCode() : 0);
    result =
        31 * result + (this.acceptedTermsOfUse != null ? this.acceptedTermsOfUse.hashCode() : 0);
    result =
        31 * result
            + (this.acceptedTermsOfUseAt != null ? this.acceptedTermsOfUseAt.hashCode() : 0);
    return result;
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
   * Sets new country.
   *
   * @param country New value of country.
   */
  public void setCountry(String country) {
    this.country = country;
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

  /**
   * Gets acceptedTermsOfUse.
   *
   * @return Value of acceptedTermsOfUse.
   */
  public Boolean getAcceptedTermsOfUse() {
    return acceptedTermsOfUse;
  }

  /**
   * Sets new acceptedTermsOfUse.
   *
   * @param acceptedTermsOfUse New value of acceptedTermsOfUse.
   */
  public void setAcceptedTermsOfUse(Boolean acceptedTermsOfUse) {
    this.acceptedTermsOfUse = acceptedTermsOfUse;
  }

  /**
   * Gets acceptedTermsOfUseAt.
   *
   * @return Value of acceptedTermsOfUseAt.
   */
  public Date getAcceptedTermsOfUseAt() {
    return acceptedTermsOfUseAt;
  }

  /**
   * Sets new acceptedTermsOfUseAt.
   *
   * @param acceptedTermsOfUseAt New value of acceptedTermsOfUseAt.
   */
  public void setAcceptedTermsOfUseAt(Date acceptedTermsOfUseAt) {
    this.acceptedTermsOfUseAt = acceptedTermsOfUseAt;
  }
}
