package odev;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println("Ogrenci eklendi");
	}
	
	public void registerStudent(Student student,Course course) {
		System.out.println(student.getFirstname()+" , "+course.getCourseName()+" kursuna kayýt oldu!");
	}
	public void unregisterStudent(Student student, Course course) {
		System.out.println(student.getFirstname()+" kullanýcýsýnýn, "+course.getCourseName()+" kursundan kaydý silindi!");
	}
	
	
	
   }
	







