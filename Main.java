public class Main{
	public static void main(String[] args) {

//SocialMedia Class
		System.out.println("Social Media Class.\n");
		SocialMedia s1 = new SocialMedia();
		SocialMedia s2 = new SocialMedia("Talha", "Aftab", "Tehseen");
		System.out.println("toString");
		System.out.println(s1);//toString
		s1.setFirstName("Hamza ");
		s1.setLastName("Aslam");
		System.out.println("Are first Names equal: " + s1.equals(s2));
		System.out.println("\n");

//Friend Class
		System.out.println("Friend Class.\n");
		Friend f1 = new Friend();
		Friend f2 = new Friend("Ahmad");
		f1.sendFriendRequest("Ahsan Ali");
		System.out.println(f1.showFriendRequest() + " sent you friend request.");
		System.out.println("toString");
		System.out.println(f2); //toString
		System.out.println("Are both requests same: " + f1.equals(f2));
		System.out.println("\n");

//User Class
		System.out.println("User Class.\n");
		User u1 = new User();
		User u2 = new User("1/1/2020", "Male", "0123456789", "Tehseen123@gmail.com", f2);
		User u3 = new User("1/1/1857", "Female", "123123123", "Abc@gmail.com", "Talha ","Aftab ","Hamza ", f1);		
		System.out.println("toString");
		System.out.print("User 2.");
		System.out.println(u2 + "\n\ntoString");//toString
		System.out.println("User 3" + u3);
		System.out.println("\nUser 1");
		u1.setDateOfBirth("1/1/1203");
		u1.setGender("Male");
		u1.setContactNo("123");
		u1.setEmail("abc@gmail.com");
		u1.setFriendName("ABC");
		System.out.println("Date of Birth: " + u1.getDateOfBirth());
		System.out.println("Gender: " + u1.getGender());
		System.out.println("Contact No: " + u1.getContactNo());
		System.out.println("Email: " + u1.getEmail());
		System.out.println("Friend Name: " + u1.getFriendName());
		User u4 = new User();
		User u5 = new User();
		u4.addUser("Ali", "Ahmad", "12/1/2012", "Male", "0300000000", "aliahmad@gmail.com");
		u5.addUser("Ali", "Ahmad", "12/1/2012", "Male", "0300000000", "aliahmad@gmail.com");
		u5.addFriends("Ali", "Ahmad");
		System.out.println("Are user4 and user5 same: " + u4.equals(u5));
		System.out.println();

//Post Class
		System.out.println("\nPost Class");
		Post p1 = new Post();
		Post p2 = new Post("This is a Post");
		Post p3 = new Post("This is a Post", "This is a Message", "This is a News", "This is a Question", "This is a Story");
		p3.addComment("Your Post is Attractive.");
		p3.addComment("Good Message.");
		p3.addComment("Useful News.");
		p1.setAddData("We are adding data to the post");
		System.out.println(p1.getAddData());
		p1.addMessage("This is another Message.");
		p1.addNews("This is another News.");
		p1.addQuestion("This is another Question.");
		p1.addStories("This is another Story.");
		p3.viewPost();
		System.out.println("toString");
		System.out.println("Post 3.");
		System.out.println(p3); //toString
		System.out.println("Are both posts same: " + p1.equals(p2));
		System.out.println("\n");

//Comment Class(Only check methods implemetations, Without Composition.)
		System.out.println("Comment Class.");
		Comment cc1 = new Comment();
		Comment cc2 = new Comment("This is a comment.");
		cc1.addComment("This is another comment.");
		cc1.viewComment();
		System.out.println("toString");
		System.out.println(cc2); //toString
		System.out.println("Are both comments same: " + cc1.equals(cc2));

	}//main
}