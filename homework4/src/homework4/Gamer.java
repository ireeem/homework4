package homework4;

public class Gamer {
private int id;
private String firstName;
private String lastName;
private String identityNumber;
private String birthYear;
public Gamer(int id, String firstName, String lastName, String identityNumber, String birthYear) {
	
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
	this.identityNumber = identityNumber;
	this.birthYear = birthYear;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getIdentityNumber() {
	return identityNumber;
}
public void setIdentityNumber(String identityNumber) {
	this.identityNumber = identityNumber;
}
public String getBirthYear() {
	return birthYear;
}
public void setBirthYear(String birthYear) {
	this.birthYear = birthYear;
}


}
