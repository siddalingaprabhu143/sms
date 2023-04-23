package com.student.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.stereotype.Controller; 
import com.student.Entity.Student;
import com.student.Service.StudentService;

@Controller
public class StudentController {
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	@GetMapping("/students")
	public String findAllStudents(Model model) { 
		//here we are adding attribute to model
		model.addAttribute("students", studentService.getAllStudents());
		return "students";//here we are returning a thymeleaf view
	}
	@GetMapping("/student/new")
	public String addStudent(Model model) {
		Student student=new Student();
		model.addAttribute("student", student);
		return "create_student"; 
	}

	@PostMapping("/students")
	//@ModelAttribute is used to bind the form data to object
	public String saveStudent(@ModelAttribute("Student") Student student) {
		studentService.save(student);
		return "redirect:/students";
	}
	@GetMapping("/student/edit/{id}")
	public String editStudent(@PathVariable Long id,Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";

	}
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,@ModelAttribute("Student") Student student,Model model) {
		Student existingStudent=new Student();//get Student from from data base
		existingStudent.setId(id);
		existingStudent.setFirst_Name(student.getFirst_Name());
		existingStudent.setLast_Name(student.getLast_Name());   
		existingStudent.setEmail(student.getEmail());
		//to update student
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}


	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id,Model model) {
		studentService.DeleteStudentById(id);
		return "redirect:/students";
	}
}
