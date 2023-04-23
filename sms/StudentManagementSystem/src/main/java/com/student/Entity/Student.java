package com.student.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="first_Name",nullable = false)
	private String first_Name;
	@Column(name="last_Name")
	private String last_Name;
	@Column(name="email",nullable = false)
	private String email;


	//hibernate internally uses proxies to generate dynamic queries which uses default constructor
	public Student() {
		super();
	}
	public Student(String first_Name, String last_Name, String email) {
		super();
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", first_Name=" + first_Name + ", last_Name=" + last_Name + ", email=" + email + "]";
	}

}
