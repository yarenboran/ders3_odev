package odev;

public class Student extends User {
	private Course[] registerToCourses;
	private String progress;
	
	public Course[] getRegisterToCourses() {
		return registerToCourses;
	}
	public void setRegisterToCourses(Course[] registerToCourses) {
		this.registerToCourses = registerToCourses;
	}
	public String getProgress() {
		return "%"+ progress;
	}
	public void setProgress(String progress) {
		this.progress = progress;
	}

}
