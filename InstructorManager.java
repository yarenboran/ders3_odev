package odev;

public class InstructorManager extends UserManager {
	public void add(User user) {
		super.add(user);
		System.out.println("Egitmen Eklendi");
	}
	public void addCourse(Instructor instructor,Course course) {
		System.out.println(instructor.getFirstname()+instructor.getLastname() +course.getCourseName()+" kursunu acti");
	}
	public void addMultipleCourse(Instructor instructor,Course[] courses) {
		for (Course course : courses) {
			addCourse(instructor, course);
		}		
	}
	
	public void deleteCourse(Instructor instructor,Course course) {
		System.out.println(instructor.getFirstname()+instructor.getLastname() +course.getCourseName()+" kursunu iptal etti");
	}

}
