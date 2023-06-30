public class User extends SocialMedia{
	private String dateOfBirth;
	private String gender;
	private String contactNo;
	private String email;
	private Friend friend;
//Cons
	public User(){
		dateOfBirth =  gender = contactNo = email = null;
	}
	public User(String dateOfBirth, String gender, String contactNo, String email, Friend friend){
		setDateOfBirth(dateOfBirth);
		setGender(gender);
		setContactNo(contactNo);
		setEmail(email);
		this.friend = friend;
	}
	public User(String dateOfBirth, String gender, String contactNo, String email,
	String firstName, String lastName, String friendName, Friend friend){
		super(firstName, lastName, friendName);
		setDateOfBirth(dateOfBirth);
		setGender(gender);
		setContactNo(contactNo);
		setEmail(email);
		this.friend = friend;
	}
//Setters
	public void setDateOfBirth(String dateOfBirth){
		this.dateOfBirth = dateOfBirth;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setContactNo(String contactNo){
		this.contactNo = contactNo;
	}
	public void setEmail(String email){
		this.email = email;
	}
//Getters
	public String getDateOfBirth(){
		return dateOfBirth;
	}
	public String getGender(){
		return gender;
	}
	public String getContactNo(){
		return contactNo;
	}
	public String getEmail(){
		return email;
	}
//updateProfile
	public void updateProfile(String firstName, String lastName, String dateOfBirth, String gender, String contactNo, String email){
		addUser(firstName, lastName, dateOfBirth, gender, contactNo, email);
		addFriends(firstName, lastName);
	}
//addUser
	public void addUser(String firstName, String lastName, String dateOfBirth, String gender, String contactNo, String email){
		super.setFirstName(firstName);
		super.setLastName(lastName);
		setDateOfBirth(dateOfBirth);
		setGender(gender);
		setContactNo(contactNo);
		setEmail(email);
	}
//addFriend

	public void addFriends(String firstName, String lastName){
		super.setFirstName(firstName);
		super.setLastName(lastName);
	}

//equals
@Override
	public boolean equals(Object o){
		if (!(o instanceof User)){
			return false;
		}
		User  s = (User) o;

	if(o == this){
		return true;
	}
		return(this.getFirstName().equals(s.getFirstName()));
	}
	
//toSting
	@Override
	public String toString(){
		return "\nDateOfBirth: " + getDateOfBirth() + "\nGender: " + getGender() + 
		"\nContactNo: " + getContactNo() + "\nEmail: " + getEmail() + "\n" + this.friend;
	}
}