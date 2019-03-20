package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.main.Laptop;

public class LaptopTest {

	private static Laptop hpLaptop;
	private static Laptop dellLaptop;
	private static Laptop acerLaptop;

	@BeforeClass
	public static void setUp() {
		hpLaptop = new Laptop("HP", "notebook", "Windows 10", "i5");
		dellLaptop = new Laptop("Dell", "Inspiron", "Windows 8.1", "i7");
		acerLaptop = new Laptop("acer", "Aspire", "Windows 7", "i3");
	}

	@Test
	public void testForOrderInputUsingArrayList() {
		ArrayList<Laptop> laptops = new ArrayList<>();
		laptops.add(acerLaptop);
		laptops.add(hpLaptop);
		laptops.add(dellLaptop);

		Iterator<Laptop> iterator = laptops.iterator();
		assertEquals(acerLaptop, iterator.next());
		assertEquals(hpLaptop, iterator.next());
		assertEquals(dellLaptop, iterator.next());
	}

	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForReferenceValue() {
		HashSet<Laptop> Laptops = new HashSet<>();
		Laptops.add(hpLaptop);
		Laptops.add(dellLaptop);
		Laptops.add(acerLaptop);
		Laptops.add(hpLaptop);

		assertEquals(3, Laptops.size());

	}

	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForObject() {
		HashSet<Laptop> Laptops = new HashSet<>();

		Laptop laptop1 = new Laptop("HP", "notebook", "Windows 10", "i5");
		Laptops.add(hpLaptop);
		Laptops.add(laptop1);

		assertEquals(1, Laptops.size());
	}
}
