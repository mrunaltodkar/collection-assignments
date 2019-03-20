package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.main.Cellphone;

public class CellPhoneTest {

	private static Cellphone samsung;
	private static Cellphone xiomi;
	private static Cellphone vivo;

	@BeforeClass
	public static void setUp() {
		samsung = new Cellphone("Samsung", "M10", "4 GB Ram and 64 GB storage", "android 8.1", 20000);
		xiomi = new Cellphone("Xiomi", "Note 5 pro", "3 GB Ram and 64 GB storage", "android 6", 15000);
		vivo = new Cellphone("Vivo", "V9", "3 GB Ram and 128 GB storage", "android 7", 30000);
	}

	@Test
	public void testForOrderInputUsingArrayList() {
		ArrayList<Cellphone> CellPhones = new ArrayList<>();
		CellPhones.add(samsung);
		CellPhones.add(xiomi);
		CellPhones.add(vivo);

		Iterator<Cellphone> iterator = CellPhones.iterator();
		assertEquals(samsung, iterator.next());
		assertEquals(xiomi, iterator.next());
		assertEquals(vivo, iterator.next());
	}

	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForReferenceValue() {
		HashSet<Cellphone> CellPhones = new HashSet<>();
		CellPhones.add(samsung);
		CellPhones.add(xiomi);
		CellPhones.add(vivo);
		CellPhones.add(samsung);

		assertEquals(3, CellPhones.size());

	}

	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForObject() {
		HashSet<Cellphone> CellPhones = new HashSet<>();

		Cellphone cellPhone1 = new Cellphone("Samsung", "M10", "4 GB Ram and 64 GB storage", "android 8.1", 20000);
		CellPhones.add(samsung);
		CellPhones.add(cellPhone1);

		assertEquals(1, CellPhones.size());
	}
}
