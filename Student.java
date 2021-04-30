package odev;

public class Student extends User {
	private Course[] registeredCourses;
	private String progress;
	
	public Course[] registeredCourses() {
		return registeredCourses;
	}
	public void setregisteredCourses(Course[] registeredCourses) {
		this.registeredCourses  = registeredCourses;
	}
	public String getProgress() {
		return "%"+ progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}

}
