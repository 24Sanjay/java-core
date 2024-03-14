package com.learning.core.day6;

import java.util.TreeMap;
import java.util.Map;
import java.util.Comparator;

class Car2 implements Comparable<Car2> {
	private String name;
	private double price;

	public Car2(String name, double price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int compareTo(Car2 otherCar) {
		return Double.compare(this.price, otherCar.price);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Car2 car = (Car2) obj;
		return name.equals(car.name);
	}

	@Override
	public String toString() {
		return name + " " + price;
	}
}

public class D06P06 {
	public static void main(String[] args) {

		TreeMap<Car2, String> carMap = new TreeMap<>(Comparator.reverseOrder());

		carMap.put(new Car2("Bugatti", 80050.0), "Bugatti");
		carMap.put(new Car2("Swift", 305000.0), "Swift");
		carMap.put(new Car2("Audi", 600100.0), "Audi");
		carMap.put(new Car2("Benz", 900000.0), "Benz");

		System.out.println("Car Prices in Reverse Order:");
		for (Map.Entry<Car2, String> entry : carMap.entrySet()) {
			System.out.println(entry.getKey().toString());
		}
	}
}