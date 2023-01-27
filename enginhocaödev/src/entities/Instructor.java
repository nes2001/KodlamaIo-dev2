package entities;

public class Instructor implements Entity {

   private int id;
   private String name;
   private int numberOfCoursesThatInstructorTeaches;

   
   
   
   public Instructor(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}




public Instructor(int id, String name, int numberOfCoursesThatInstructorTeaches) {
	super();
	this.id = id;
	this.name = name;
	this.numberOfCoursesThatInstructorTeaches = numberOfCoursesThatInstructorTeaches;
}




public int getId() {
	return id;
}




public void setId(int id) {
	this.id = id;
}




public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public int getNumberOfCoursesThatInstructorTeaches() {
	return numberOfCoursesThatInstructorTeaches;
}




public void setNumberOfCoursesThatInstructorTeaches(int numberOfCoursesThatInstructorTeaches) {
	this.numberOfCoursesThatInstructorTeaches = numberOfCoursesThatInstructorTeaches;
}




@Override
public String toString() {
	return "Instructor [id=" + id + ", name=" + name + ", numberOfCoursesThatInstructorTeaches="
			+ numberOfCoursesThatInstructorTeaches + "]";
}

   
   

   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   




}
