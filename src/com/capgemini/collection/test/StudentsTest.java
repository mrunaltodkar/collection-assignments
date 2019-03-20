package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.main.Students;

public class StudentsTest {

	private static Students mrunal;
	private static Students aayush;
	private static Students prangshu;

	@BeforeClass
	public static void setUp() {
		mrunal = new Students("Mrunal", 20, "cs", "Male");
		aayush = new Students("Aayush", 15, "cs", "Male");
		prangshu = new Students("Prangshu", 12, "cs", "Male");
	}

	@Test
	public void testForAddInputInOrder() {
		ArrayList<Students> students = new ArrayList<>();

		students.add(mrunal);
		students.add(aayush);
		students.add(prangshu);

		Iterator<Students> iterate = students.iterator();

		assertEquals(mrunal, iterate.next());

		iterate.hasNext();

		assertEquals(aayush, iterate.next());

		iterate.hasNext();

		assertEquals(prangshu, iterate.next());
	}

	@Test
	public void testForCheckingItMaintainNaturalOrderOrNot() {

		TreeSet<Students> treeset = new TreeSet<Students>();

		treeset.add(mrunal);
		treeset.add(aayush);
		treeset.add(prangshu);

		Iterator<Students> iterate = treeset.iterator();

		assertEquals(aayush, iterate.next());

		
		
	}

}
