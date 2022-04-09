package com.enthrall.catchup;

public class TestStudentForm {

	public static void main(String[] args) {
		StudentFormClass johnStudentForm = new StudentFormClass();
		johnStudentForm.setStudentId(2255655l);
		System.out.println(johnStudentForm.studentId); johnStudentForm.getFullName();
		
		StudentFormClass jeanStudentForm = new StudentFormClass("test@test.com");
		System.out.println(jeanStudentForm.email);
		
		System.out.println(johnStudentForm.email);
		
		String a = "2";
		String b = "8";
		
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		
		double i = 2.6;
		System.out.println((int)i);
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		
		
		
		/*
		 * com.enthrall.anotherpackage.StudentFormClass differentClass = new
		 * com.enthrall.anotherpackage.StudentFormClass();
		 * System.out.println(differentClass.firstName);
		 */
	}
}
