package entities;

public class Instructor {
	public Instructor(String firstName,String lastName, String aboutInstructor) 
	{
		this.aboutInstructor=aboutInstructor;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	private String firstName;
	private String lastName;
	private String aboutInstructor;
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
	public String getAboutInstructor() {
		return aboutInstructor;
	}
	public void setAboutInstructor(String aboutInstructor) {
		this.aboutInstructor = aboutInstructor;
	}

}
