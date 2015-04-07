package shha;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
	
	private static final long serialVersionUID = -3034350229897782290L;
	
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	
	public Person(String firstName, String lastName, Date dateOfBirth, String streetAddress, String city, String state, String zip) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zip = zip;
	
	}
	
	public Person(String line) {
		String[] values = line.split(",");
		
		firstName = values[0].trim();
		lastName = values[1];
		dateOfBirth = new Date(values[2]);
		streetAddress = values[3];
		city = values[4];
		state = values[5];
		zip = values[6];
		
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
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public boolean equals(Person p) {
		if (firstName.equals(p.getFirstName()) &&
			lastName.equals(p.getLastName()) &&
			dateOfBirth.toString().equals(p.getDateOfBirth().toString())) {
			return true;
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return String.format("person [firstName=%s, lastName=%s, dateOfBirth=%s, streetAddress=%s, city=%s, state=%s, zip=%s]", firstName, lastName, dateOfBirth, streetAddress, city, state, zip);
	}
	
	public String toStorageFormat() {
		return String.format("%s,%s,%s,%s,%s,%s,%s", firstName, lastName, dateOfBirth, streetAddress, city, state, zip);
	}
        
        public enum Role {

        PATIENT("P"),

        NURSE("N"),

        DOCTOR("D"),

        ADMIN("A"),

        UNKNOWN("U");

        String role;

        Role(String role)

        {

        this.role = role;

}

public String getRole()

{

return role;

} 

public static Role fromString(String text) {

    if (text != null) {

      for (Role b : Role.values()) {

        if (text.trim().equalsIgnoreCase(b.role)) {

          return b;

        }

      }

    }

    return UNKNOWN;

  }

}
        
}