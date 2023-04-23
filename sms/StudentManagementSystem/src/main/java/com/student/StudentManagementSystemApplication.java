package com.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.student.Entity.Student;
import com.student.Repository.StudentRepository;
import com.student.Service.StudentService;

@SpringBootApplication
//$ to fetch the data from the controller
//@ to navigate to different mapping
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	@Autowired
     private StudentRepository studentRepository;
	@Override//CommodLineRunner is an interface which as run() which gets executed 
	//at the started time of spring boot app
	public void run(String... args) throws Exception {
//		Student s1=new Student("siddalinga","prabhu","prabhu@gmail.com");
//		studentRepository.save(s1);
//		Student s2=new Student("hemanth","moti","moti@gmail.com");
//		studentRepository.save(s2);	
//		studentRepository.deleteAll();
	}

}
