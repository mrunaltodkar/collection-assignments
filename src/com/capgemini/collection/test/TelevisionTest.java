package com.capgemini.collection.test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.main.Television;

class TelevisionTest {
	
	private static Television samsungTV;
	private static Television lgTV;
	private static Television sonyTV;
	
	@BeforeClass
	public void setUp() {
		samsungTV = new Television("Samsung", "LCD" , true, 30000);
		lgTV = new Television("LG", "LED" , false, 20000);
		sonyTV = new Television("Sony","Plasma" , true, 40000);
		
	}

	@Test
	public void testForSetDoesNotAcceptDuplicateObjects() {
		HashSet<Television> television = new HashSet<>();
		
		Television television1 = new Television("LG", "LED", false, 500000);
		
		television.add(samsungTV);
		television.add(sonyTV);
		television.add(lgTV);
		television.add(television1);
		television.add(samsungTV);
		
		assertEquals(3, television.size());
	}
	
	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForObject() {
		HashSet<Television> television = new HashSet<>();
		
		Television television1 = new Television("LG", "LED", false, 500000);
		
		television.add(sonyTV);
		television.add(lgTV);
		television.add(television1);
		
		assertEquals(2, television.size());
	}


}
