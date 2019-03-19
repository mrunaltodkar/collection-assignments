package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.main.Laptop;

public class LaptopTest {

	private static Laptop hplaptop;
	private static Laptop dellLaptop;
	private static Laptop acerlaptop;

	@BeforeClass
	public static void setUp() {
		hplaptop = new Laptop("HP", "notebook", "Windows 10", "i5");
		dellLaptop = new Laptop("Dell", "Inspiron", "Windows 8.1", "i7");
		acerlaptop = new Laptop("acer", "Aspire", "Windows 7", "i3");
	}

	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForReferenceValue() {
		HashSet<Laptop> Laptops = new HashSet<>();
		Laptops.add(hplaptop);
		Laptops.add(dellLaptop);
		Laptops.add(acerlaptop);
		Laptops.add(hplaptop);
		
		assertEquals(3, Laptops.size());
		
	}
	
	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForObject() {
		HashSet<Laptop> Laptops = new HashSet<>();
		
		Laptop laptop1 = new Laptop("HP", "notebook", "Windows 10", "i5");
		Laptops.add(hplaptop);
		Laptops.add(laptop1);
		
		assertEquals(1, Laptops.size());
	}
}
