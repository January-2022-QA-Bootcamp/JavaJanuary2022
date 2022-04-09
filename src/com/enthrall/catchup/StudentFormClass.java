package com.enthrall.catchup;

public class StudentFormClass {

	public String firstName = "John";
	String lastName = "Doe";
	char gender;
	String dateOfBirth;
	String address;
	int phone;
	String email;
	String emergencyContactName;
	String emergencyContactNumber;
	String race;
	String course;
	byte rollNo;
	long studentId;
	short gpa;
	char whiteSpace;
	
	public StudentFormClass() {
		System.out.println("Student Form - No Argument Constructor");
	}
	
	public StudentFormClass(String email) {
		this.email = email;
		System.out.println("Student Form - Argument Constructor");
	}
	
	public void setStudentId(long studentId){
		this.studentId = studentId;
	}
	
	public void getFullName(){
		System.out.println(firstName + whiteSpace + lastName);
	}
	
}
