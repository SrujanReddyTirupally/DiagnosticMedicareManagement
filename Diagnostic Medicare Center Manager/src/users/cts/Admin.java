package users.cts;
public class Admin {
	private String AdminId;
	private String FirstName;
	private String LastName;
	private String Age;
	private String Gender;
	private String DoB;
	private String ContactNumber;
	private String AltContactNumber;
	private String EmailID;
	private String Password;	
		
		public String getAdminId() {
		return AdminId;
	}


	public void setAdminId(String adminId) {
		AdminId = adminId;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getAge() {
		return Age;
	}


	public void setAge(String age) {
		Age = age;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		Gender = gender;
	}


	public String getDoB() {
		return DoB;
	}


	public void setDoB(String doB) {
		DoB = doB;
	}


	public String getContactNumber() {
		return ContactNumber;
	}


	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}


	public String getAltContactNumber() {
		return AltContactNumber;
	}


	public void setAltContactNumber(String altContactNumber) {
		AltContactNumber = altContactNumber;
	}


	public String getEmailID() {
		return EmailID;
	}


	public void setEmailID(String emailID) {
		EmailID = emailID;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


		public Admin()
	{
		
	}
	
	
	public Admin(String adminId, String firstName, String lastName, String age, String gender, String doB,
			String contactNumber, String altContactNumber, String emailID, String password) {
		super();
		AdminId = adminId;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		Gender = gender;
		DoB = doB;
		ContactNumber = contactNumber;
		AltContactNumber = altContactNumber;
		EmailID = emailID;
		Password = password;
		
	}
	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age
				+ ", Gender=" + Gender + ", DoB=" + DoB + ", ContactNumber=" + ContactNumber + ", AltContactNumber="
				+ AltContactNumber + ", EmailID=" + EmailID + ", Password=" + Password + "]";
	}
}

