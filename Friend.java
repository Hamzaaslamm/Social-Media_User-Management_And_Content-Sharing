public class Friend extends SocialMedia{
	private String friendRequest;
	
//Cons
	public Friend(){
		friendRequest = null;
	}
	public Friend(String friendName){
		super(friendName);
	}

//sendFriendRequest
	public void sendFriendRequest(String friendRequest){
		this.friendRequest = friendRequest;
		System.out.println("Your friend Request sent to  " + this.friendRequest);
	}
//showFriendRequest
	public String showFriendRequest(){
		return friendRequest;
	}

//toSting
@Override
	public String toString(){
	return "Friend Name: " + super.getFriendName();
	}

//equals
@Override
	public boolean equals(Object o){
		if (!(o instanceof Friend)){
			return false;
		}
		Friend  s = (Friend) o;

	if(o == this){
		return true;
	}
		return(this.showFriendRequest().equals(s.showFriendRequest()));
	}
}//class