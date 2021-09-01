package UserIo;

import business.abstracts.CourseService;
import business.concretes.CourseManager;
import dataAccess.concretes.hibernate.HibernateCourseDao;
import entities.concretes.Category;
import entities.concretes.Course;
import entities.concretes.Teacher;

public class Main {

	public static void main(String[] args) {
		
		
		Teacher teacher1 = new Teacher(1, "Nvm", "Backend Devoloper", 1, "Abdullah", "Bilgen", "1234", "blgn@gmail.com", "bey.jpg");
		Teacher teacher2 = new Teacher(2, "Nmv", "Front end Devoloper", 2, "Özkan", "Demircan", "4321", "dmrcn@gmail.com", "dmrbey.jpg");
		
		Category category1 = new Category(1, "Programmer");
		Category category2 = new Category(2, "Analysis");
		
		Course course1 = new Course(1, category1, "Java", "Back end", "java.jpg", teacher1, 10);
		Course course2 = new Course(2, category2, "Kotlin", "Specialist", "kotlin.jpg", teacher2, 9);
		
		CourseService courseService = new CourseManager(new HibernateCourseDao());
		courseService.add(course1);
		courseService.add(course2);
		
		
		for (Course course : courseService.search("Kotlin")) {
			System.out.println(teacher1.getFirstName()+ "  " +category1.getName());
		}	

	}

}
