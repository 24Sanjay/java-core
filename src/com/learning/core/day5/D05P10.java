package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Person4 implements Comparable<Person4> {
    private int id;
    private String name;
    private int age;
    private double salary;

    public Person4(int id, String name, int age, double salary) {
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

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Person4 person = (Person4) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person4 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P10 {
    public static void main(String[] args) {
        // Creating Person objects
        Person4 person1 = new Person4(1, "Kerry", 30, 999);
        Person4 person2 = new Person4(2, "Smith", 25, 5999);
        Person4 person3 = new Person4(3, "Popeye", 35,2999);
        Person4 person4 = new Person4(4, "Jones", 22, 6999);
        Person4 person5 = new Person4(5, "John", 28, 1999);
        Person4 person6 = new Person4(6, "Tom", 40, 3999);

        // Storing persons in a TreeSet
        TreeSet<Person4> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        // Finding and printing the first person whose name starts with 'J'
        System.out.println("First person whose name starts with 'J':");
        for (Person4 person : personSet) {
            if (person.getName().startsWith("J")) {
                System.out.println(person.getName() + ": ID - " + person.getId() + ", Age - " + person.getAge() + ", Salary - " + person.getSalary());
                break;
            }
        }
    }
}