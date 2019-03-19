package com.capgemini.collection.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.collection.main.Car;

public class CarTest {

	private static Car bmwCar;
	private static Car audiCar;
	private static Car mercedesCar;

	@BeforeClass
	public static void setUp() {
		bmwCar = new Car("BMW", "X6", 2018, 5000000);
		audiCar = new Car("Audi", "Q5", 2016, 3500000);
		mercedesCar = new Car("mercedes", "Benz", 2017, 4000000);
	}

	@Test
	public void testForSetDoesNotAcceptDuplicateObjects() {
		HashSet<Car> car = new HashSet<>();
		
		car.add(bmwCar);
		car.add(audiCar);
		car.add(mercedesCar);
		car.add(audiCar);
		car.add(mercedesCar);
		
		assertEquals(3, car.size());
	}
	
	@Test
	public void testForSetDoesNotAcceptDuplicateValuesForObject() {
		HashSet<Car> car = new HashSet<>();
		
		Car car1 = new Car("Audi", "Q5", 2016, 3500000);
		car.add(audiCar);
		car.add(bmwCar);
		car.add(car1);
		
		assertEquals(2, car.size());
	}

}
