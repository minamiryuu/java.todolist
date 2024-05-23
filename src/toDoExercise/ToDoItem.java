package toDoExercise;

public class ToDoItem {

	private String title; 
	private int importance; 
	private String status; 
	
	public ToDoItem(String title, int importance) {
		this.title = title;
		this.importance = importance;
		this.status = "未着手";
	}
	
	public String gettitle() {
		return title;
	}
	
	public int getimportance() {
		return importance;
	}
	
	public String getstatus() {
		return status;
	}
	
	public void settitle(String title) {
		this.title = title;
	}
	
	public void setimportance(int importance) {
		this.importance = importance;
	}
	
	public void setstatus(String status) {
		this.status = status;
	}
		
}
