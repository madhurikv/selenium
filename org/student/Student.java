package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("In the student name method");

	}
	public void studentDept() {
		System.out.println("in the student department method");

	}
public void stdentId() {
	System.out.println("In the student Id method");

}
	public static void main(String[] args) {
		Student stud = new Student();
		stud.collegeName();
		stud.collegeCode();
		stud.collegeRank();
		
		stud.deptName();
		stud.studentName();
		stud.stdentId();
		stud.studentDept();
		
	}

}
