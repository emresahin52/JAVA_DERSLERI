package ders2?dev;



public class Main {

	public static void main(String[] args) {
		
		CourseManager coursemanager1 = new CourseManager(1,"Engin Demiro?",21.00);
		CourseManager coursemanager2 = new CourseManager(1,"Emrah y?ksel",22.00);
		CourseManager coursemanager3 = new CourseManager(1,"Emre ?ahin",23.00);
		
		CourseManager [] courses = {coursemanager1,coursemanager2,coursemanager3};
		
		for (CourseManager courseManager : courses) {
			System.out.println(courseManager.egitmen);
		}
		
	}

}
