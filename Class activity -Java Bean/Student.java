package servlet;
/**
 *
 * @author mpenderg
 */
public class Student {
    String name = "";
    String matricNo = "";
    String gender = "";
    String maritalStatus = "";
    String dateOfBirth = "";
    String citizenship = "";
    String religion = "";
    boolean active;
    String currentYear,idNo;
    
    boolean loggedIn = false;
   
   public boolean getActive() {
	return active;
   }
   
   public String getCitizenship() {
	return citizenship;
}
   public String getCurrentYear() {
	return currentYear;
}
   public String getDateOfBirth() {
	return dateOfBirth;
}
   public String getGender() {
	return gender;
}
   public String getIdNo() {
	return idNo;
}
   public String getMaritalStatus() {
	return maritalStatus;
}
   public String getMatricNo() {
	return matricNo;
}
   public String getName() {
	return name;
}
   public String getReligion() {
	return religion;
}
   
   public void setActive(boolean active) {
	this.active = active;
}
   public void setCitizenship(String citizenship) {
	this.citizenship = citizenship;
}
   public void setCurrentYear(String currentYear) {
	this.currentYear = currentYear;
}
   public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
   public void setGender(String gender) {
	this.gender = gender;
}
   public void setIdNo(String idNo) {
	this.idNo = idNo;
}
   public void setLoggedIn(boolean loggedIn) {
	this.loggedIn = loggedIn;
}
   public void setMaritalStatus(String maritalStatus) {
	this.maritalStatus = maritalStatus;
}
   public void setMatricNo(String matricNo) {
	this.matricNo = matricNo;
}
   public void setName(String name) {
	this.name = name;
}
   public void setReligion(String religion) {
	this.religion = religion;
}
    
  
}