package Movies;

enum Gender {MALE, FEMALE};

public class Person {
	private String firstName;
	private String lastName;
	Gender gender;
	private boolean hasOscar;
	private boolean hasGoldenGlobe;

	public String getFirstName() { return firstName; }
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getLastName() { return lastName; }
	public void setLastName(String lastName) { this.lastName = lastName; }

	public Gender getGender() { return gender; }
	public void setGender(Gender gender) { this.gender = gender; }

	public boolean isHasOscar() { return hasOscar; }
	public void setHasOscar(boolean hasOscar) { this.hasOscar = hasOscar; }

	public boolean isHasGoldenGlobe() { return hasGoldenGlobe; }
	public void setHasGoldenGlobe(boolean hasGoldenGlobe) { this.hasGoldenGlobe = hasGoldenGlobe; }

	public String toXMLString(){
		String firstName = Tools.toXMLTag("firstName", this.firstName);
		String lastName = Tools.toXMLTag("lastName", this.lastName);
		String gender = Tools.toXMLTag("gender", this.gender.toString());
		String hasOscar = Tools.toXMLTag("hasOscar", Boolean.toString(this.hasOscar));
		String hasGoldenGlobe = Tools.toXMLTag("hasGoldenGlobe", Boolean.toString(this.hasGoldenGlobe));
		return Tools.toXMLTag("person", firstName + lastName + gender + hasOscar + hasGoldenGlobe);
	}
}
