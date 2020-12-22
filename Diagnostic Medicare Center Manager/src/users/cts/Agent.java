package users.cts;

public class Agent {
	private String UserId;
	private String FirstName;
	private String LastName;
	private String Age;
	private String Gender;
	private String DoB;
	private String ContactNumber;
	private String AltContactNumber;
	private String EmailID;
	private String Password;
	private String AddressLine1;
	private String AddressLine2;
	private String City;
	private String State;
	private String ZipCode;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
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
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZipCode() {
		return ZipCode;
	}
	public void setZipCode(String zipCode) {
		ZipCode = zipCode;
	}
	public Agent(String userId, String firstName, String lastName, String age, String gender, String doB,
			String contactNumber, String altContactNumber, String emailID, String password, String addressLine1,
			String addressLine2, String city, String state, String zipCode) {
		super();
		UserId = userId;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		Gender = gender;
		DoB = doB;
		ContactNumber = contactNumber;
		AltContactNumber = altContactNumber;
		EmailID = emailID;
		Password = password;
		AddressLine1 = addressLine1;
		AddressLine2 = addressLine2;
		City = city;
		State = state;
		ZipCode = zipCode;
	}
	@Override
	public String toString() {
		return "Agent [UserId=" + UserId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age
				+ ", Gender=" + Gender + ", DoB=" + DoB + ", ContactNumber=" + ContactNumber + ", AltContactNumber="
				+ AltContactNumber + ", EmailID=" + EmailID + ", Password=" + Password + ", AddressLine1="
				+ AddressLine1 + ", AddressLine2=" + AddressLine2 + ", City=" + City + ", State=" + State + ", ZipCode="
				+ ZipCode + "]";
	}
	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
