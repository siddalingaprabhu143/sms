package com.student.Service;

import java.util.List;

import com.student.Entity.Student;

public interface StudentService {
public List<Student> getAllStudents();

public Student save(Student student);

public Student updateStudent(Student student);

public Student getStudentById(Long id);

public void DeleteStudentById(Long id);
}
