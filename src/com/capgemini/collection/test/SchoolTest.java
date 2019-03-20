package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.main.School;

public class SchoolTest {

	private static School sgi;
	private static School walchand;
	private static School dyp;

	@BeforeClass
	public static void setUp() {
		sgi = new School("SGI", "Kolhapur", "Kolhapur", 1);
		walchand = new School("Walchand", "Sangali", "Sangali", 2);
		dyp = new School("DYP", "Pune", "Pune", 3);
	}

	@Test
	public void testForOrderInputUsingArrayList() {
		ArrayList<School> school = new ArrayList<>();
		school.add(dyp);
		school.add(sgi);
		school.add(walchand);

		Iterator<School> iterator = school.iterator();
		assertEquals(dyp, iterator.next());
		assertEquals(sgi, iterator.next());
		assertEquals(walchand, iterator.next());
	}

	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForReferenceValue() {
		HashSet<School> school = new HashSet<>();
		school.add(sgi);
		school.add(walchand);
		school.add(dyp);
		school.add(sgi);

		assertEquals(3, school.size());

	}

	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForObject() {
		HashSet<School> school = new HashSet<>();

		School School1 = new School("SGI", "Kolhapur", "Kolhapur", 1);
		school.add(sgi);
		school.add(School1);

		assertEquals(1, school.size());
	}
}
