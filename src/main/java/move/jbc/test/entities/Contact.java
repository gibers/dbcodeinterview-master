package move.jbc.test.entities;

import javax.persistence.*;

@Entity
//@Table(name="contact")
public class Contact {

  @Id
  @GeneratedValue(strategy= GenerationType.SEQUENCE, generator = "contact_Sequence")
  @SequenceGenerator(name = "contact_Sequence", sequenceName = "seq_contact", initialValue = 1, allocationSize = 1)
  public Long idcont;

  public String firstname;
  public String lastname;
  public String phonenumber;
  public String emailaddress;


  public Long getId() {
    return idcont;
  }

  public void setFirstName(String firstName) {
    this.firstname = firstName;
  }

  public String getFirstName() {
    return firstname;
  }

  public void setLastName(String lastName) {
    this.lastname = lastName;
  }

  public String getLastName() {
    return lastname;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phonenumber = phoneNumber;
  }

  public String getPhoneNumber() {
    return phonenumber;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailaddress = emailAddress;
  }

  public String getEmailAddress() {
    return emailaddress;
  }
}
