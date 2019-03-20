package com.capgemini.collection.main;

public class StudentsMap {

	private String studentName;
	private int rollNumber;

	public StudentsMap() {
		super();
	}

	public StudentsMap(String studentName, int rollNumber) {
		super();
		this.studentName = studentName;
		this.rollNumber = rollNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
}
