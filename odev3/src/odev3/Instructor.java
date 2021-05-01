package odev3;

public class Instructor extends User {

	String Courses;

	
	
	 public  Instructor(int id, String firstName, String lastNamae, String courses) {
   	  
     }

	public Instructor(String courses) {
		super();
		this.Courses = courses;
	}

	
	public String getCourses() {
		return Courses;
	}

	public void setCourses(String courses) {
		this.Courses = courses;
	}
	
	
	
	
}
