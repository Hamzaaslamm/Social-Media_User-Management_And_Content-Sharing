public class SocialMedia{
	private String firstName;
	private String lastName;
	private String friendName;

//Cons
	public SocialMedia(){
	firstName = lastName = friendName = null;
	}
	public SocialMedia(String friendName){
		setFriendName(friendName);
	}
	public SocialMedia(String firstName, String lastName, String friendName){
	setFirstName(firstName);
	setLastName(lastName);
	setFriendName(friendName);
	}
//Setters
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public void setFriendName(String friendName){
		this.friendName = friendName;
	}
//Getters
	public String getFirstName(){
		return firstName;
	}
	public String getLastName(){
		return lastName;
	}
	public String getFriendName(){
		return friendName;
	}
//toSting
@Override
	public String toString(){
	return "FirstName: " + getFirstName() + ", LastName: " + getLastName() + ", FriendName: " + getLastName();
	}
//equals
@Override
	public boolean equals(Object o){
		if (!(o instanceof SocialMedia)){
			return false;
		}
		SocialMedia  s = (SocialMedia) o;

	if(o == this){
		return true;
	}
		return(this.getFirstName().equals(s.getFirstName()));
	}
}//class