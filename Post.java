import java.util.*;
public class Post extends SocialMedia{
	private String addData;
	private String msg, news, question, story;
	private ArrayList<Comment> comment;


//Cons
	public Post(){
		addData = null;
	}
	public Post(String addData){
		setAddData(addData);
	}
	public Post(String addData, String msg, String news, String question, String story){
		setAddData(addData);
		addMessage(msg);
		addNews(news);
		addQuestion(question);
		addStories(story);
		comment = new ArrayList();
	}
//Settters
	public void setAddData(String addData){
		this.addData = addData;
	}
//Getters
	public String getAddData(){
		return addData;
	}
//addMessage
	public void addMessage(String msg){
		this.msg = msg;
	} 
//addNews
	public void addNews(String news){
		this.news = news;
	} 
//addQuestion
	public void addQuestion(String question){
		this.question = question;
	} 
//addStories
	public void addStories(String story){
		this.story = story;
	} 
//viewPost
	public void viewPost(){
		System.out.println("Post: " + getAddData());
	}

	// *******composition********
	public void addComment(String comm){
		Comment c = new Comment(comm);
		comment.add(c);
	}

	// *******************************

//toString
	@Override
	public String toString(){
		return ("Post Content: " + getAddData() + "\n" + this.comment);
	}


//equals
@Override
	public boolean equals(Object o){
		if (!(o instanceof User)){
			return false;
		}
		Post  s = (Post) o;

	if(o == this){
		return true;
	}
		return(this.getAddData().equals(s.getAddData()));
	}
}