package odev;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println("Ogrenci eklendi");
	}
	
	public void registerStudent(Student student,Course course) {
		System.out.println(student.getFirstname()+" , "+course.getCourseName()+" kursuna kay�t oldu!");
	}
	public void registerDelete(Student student, Course course) {
		System.out.println(student.getFirstname()+" kullan�c�s�n�n, "+course.getCourseName()+" kursundan kayd� silindi!");
	}
	
	
	
   }
	







