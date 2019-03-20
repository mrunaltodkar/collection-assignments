package com.capgemini.collection.main;

public class Students implements Comparable<Students> {

	private String studentName;
	private int studentRollNumber;
	private String studentDepartment;
	private String studentGender;

	public Students() {
		super();
	}

	public Students(String studentName, int studentRollNumber, String studentDepartment, String studentGender) {
		super();
		this.studentName = studentName;
		this.studentRollNumber = studentRollNumber;
		this.studentDepartment = studentDepartment;
		this.studentGender = studentGender;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRollNumber() {
		return studentRollNumber;
	}

	public void setStudentRollNumber(int studentRollNumber) {
		this.studentRollNumber = studentRollNumber;
	}

	public String getStudentDepartment() {
		return studentDepartment;
	}

	public void setStudentDepartment(String studentDepartment) {
		this.studentDepartment = studentDepartment;
	}

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	@Override
	public int compareTo(Students obj) {
		return this.studentName.compareTo(obj.studentName);
	}

}