package odev;

public class StudentManager extends UserManager {
	public void add(User user) {
		System.out.println("Ogrenci eklendi");
	}
	
	public void registerStudent(Student student,Course course) {
		System.out.println(student.getFirstname()+" , "+course.getCourseName()+" kursuna kayıt oldu!");
	}
	public void registerDelete(Student student, Course course) {
		System.out.println(student.getFirstname()+" kullanıcısının, "+course.getCourseName()+" kursundan kaydı silindi!");
	}
	
	
	
   }
	







