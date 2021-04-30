package odev;

public class Instructor extends User {
	private String[] courses;
	private String biography;
	private String certificates;
	public String getBiography() {
		return biography;
	}
	public void setBiography(String biography) {
		this.biography = biography;
	}
	public String getCertificates() {
		return certificates;
	}
	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}
	
	

}
