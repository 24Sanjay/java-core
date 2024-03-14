package com.learning.core.day5;

import java.util.TreeSet;

class Person3 implements Comparable<Person3> {
	private int id;
	private String name;
	private int age;
	private double salary;

	public Person3(int id, String name, int age, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Person3 otherPerson) {
		return Integer.compare(this.id, otherPerson.id);
	}

	@Override
	public int hashCode() {
		return Integer.hashCode(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Person3 person = (Person3) obj;
		return id == person.id;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class D05P08 {
	public static void main(String[] args) {

		TreeSet<Person3> personSet = new TreeSet<>();

		personSet.add(new Person3(101, "Jerry", 30, 50000.0));
		personSet.add(new Person3(102, "Smith", 28, 60000.0));
		personSet.add(new Person3(103, "Popeye", 35, 55000.0));
		personSet.add(new Person3(104, "Jones", 32, 52000.0));
		personSet.add(new Person3(105, "John", 40, 70000.0));
		personSet.add(new Person3(106, "Tom", 25, 48000.0));

		for (Person3 person : personSet) {
			String formattedName = person.getName().substring(0, 1).toUpperCase()
					+ person.getName().substring(1).toLowerCase();
			System.out.println(formattedName);
		}
	}
}