public class Comment{
	private String comment;

//Cons
	public Comment(){
		comment = null;
	}
	public Comment(String comment){
		addComment(comment); 
	}
	
	public void addComment(String comment){
		this.comment = comment;		
	}
//viewComment
	public void viewComment(){
		System.out.println("Comment: " + this.comment);
	}
//showComments
	public String showComments(){
		return comment;
	}
//toString
@Override
	public String toString(){
		return "Comment: " + showComments();
	}
@Override
	public boolean equals(Object o){
		if (!(o instanceof Comment)){
			return false;
		}
		Comment  s = (Comment) o;
	if(o == this){
		return true;
	}
		return(this.showComments().equals(s.showComments()));
	}
}