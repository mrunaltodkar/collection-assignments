package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.main.StudentsMap;

public class StudentsMapTest {

	private static StudentsMap mrunal;
	private static StudentsMap aayush;
	private static StudentsMap prangshu;


	@BeforeClass
	public static void setUp() {

		mrunal = new StudentsMap("mrunal", 20);
		aayush = new StudentsMap("aayush", 15);
		prangshu = new StudentsMap("prangshu", 12);
		
	}

	@Test
	public void testStudentKeyGivesValueOfFruit() {
		HashMap<String, String> hashset = new HashMap<>();
		hashset.put(mrunal.getStudentName(), "mango");
		hashset.put(aayush.getStudentName(), "orange");
		hashset.put(prangshu.getStudentName(), "grape");
		

		assertEquals("mango", hashset.get(mrunal.getStudentName()));
		assertEquals("orange", hashset.get(aayush.getStudentName()));
		assertEquals("grape", hashset.get(prangshu.getStudentName()));
	}
}