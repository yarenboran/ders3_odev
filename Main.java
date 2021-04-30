package odev;

public class Main {

	public static void main(String[] args) {
		
		Course course=new Course();
		course.setId(1);
		course.setCourseName("C# + Angular");
		
		Course course2=new Course();
		course2.setId(2);
		course2.setCourseName("Java + React");
		
		Course[] courses= {course,course2}; 
		
		
		Student student=new Student();
		student.setId(1);
		student.setFirstname("Yaren");
		student.setLastname("Boran");
		student.setRegisterToCourses(courses);
		student.setProgress("55");
		
		
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstname("Engin");
		instructor.setLastname("Demirog");
		instructor.setBiography("-----");
		instructor.setCertificates("MCT");
		
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.registerStudent(student, course);
		
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.addMultipleCourse(instructor, courses);
		

	}

}
