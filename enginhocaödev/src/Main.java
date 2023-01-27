import coursesProject.business.concretes.CategoryManager;
import coursesProject.business.concretes.CourseManager;
import coursesProject.business.concretes.InstructorManager;
import coursesProject.core.logging.abstracts.Logger;
import coursesProject.core.logging.concretes.DatabaseLogger;
import coursesProject.core.logging.concretes.EmailLogger;
import coursesProject.core.logging.concretes.FileLogger;
import dataAccess.concretes.HibernateDao;
import dataAccess.concretes.JdbcDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

public class Main {

	public static void main(String[] args) {

		
		Logger[]loggers= {new FileLogger(), new DatabaseLogger(), new EmailLogger() };
        CourseManager courseManager=new CourseManager(new HibernateDao(),loggers);
        CategoryManager categoryManager=new CategoryManager(new JdbcDao(),loggers);
     	InstructorManager instructorManager=new InstructorManager(new HibernateDao(),loggers);
	    
	Instructor instructor=new Instructor(1,"Engin",2);
	
	 Category category1 = new Category(5, "Game Development");
   Category category2 = new Category(6, "Programlama");

   Course course1 = new Course(5, "Javascript","Engin Demirog","Programming", 10);
   Course course2 = new Course(6, "Java-React", "Engin Demirog","Programming", 15);	
	
   System.out.println("\n------------------------------------------------------\n");
 instructorManager.add(instructor);
 System.out.println("\n------------------------------------------------------\n");
 categoryManager.add(category1);
 System.out.println("\n------------------------------------------------------\n");
 categoryManager.add(category2);
 System.out.println("\n------------------------------------------------------\n");
 courseManager.add(course1);
 System.out.println("\n------------------------------------------------------\n");
 courseManager.add(course2);

	
	
	
	}

	
	
	
	
	
	
}