package com.student.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.Entity.Student;
//JpaRepository as an default implementation class simpleRepository which is annotated with @Repository
//hence no need to add @Repository annotation to StudentRepository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
