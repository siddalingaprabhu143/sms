package com.student.Service.impl;
//by default spring boot searches all the thymbleaf files in src/main/resources/template folders
//hence create all the thymbleaf template file here
import java.util.List;
import org.springframework.stereotype.Service;
import com.student.Entity.Student;
import com.student.Repository.StudentRepository;
import com.student.Service.StudentService;


@Service
public class StudentServiceImpl implements StudentService {

	
	private StudentRepository studentRepository;
	private StudentServiceImpl( StudentRepository studentRepository) {
		super();
		this.studentRepository=studentRepository;
	}
	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
		
	}
	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
		
	}
	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}
	@Override
	public Student getStudentById(Long id) {

		return studentRepository.findById(id).get();
	}
	@Override
	public void DeleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

}
