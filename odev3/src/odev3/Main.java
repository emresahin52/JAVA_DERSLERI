package odev3;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student(1,"Emre","�ahin","emresahin5252@gmail.com");
		
		Instructor instructor = new Instructor(1,"Engin","Demiro�","Java & React");
		
		StudentManager studentManager =new StudentManager();
		  studentManager.addLesson(student);
		  

			 InstructorManager instructorManager =new InstructorManager();
			  instructorManager.addCourses(instructor); 
		
	}

}
