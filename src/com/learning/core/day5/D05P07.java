package com.learning.core.day5;

import java.util.Objects;
import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
    private int id;
    private String name;
    private double salary;

    public Person2(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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
        Person2 person = (Person2) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Person2 other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P07 {
    public static void main(String[] args) {
        
        Person2 person1 = new Person2(1, "Jerry", 30, 999);
        Person2 person2 = new Person2(2, "Smith", 25, 5999);
        Person2 person3 = new Person2(3, "Popeye", 35, 2999);
        Person2 person4 = new Person2(4, "Jones", 20, 6999);
        Person2 person5 = new Person2(5, "John", 28, 1999);
        Person2 person6 = new Person2(6, "Tom", 40, 3999);

        
        TreeSet<Person2> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        // Printing id, name, and salary of each person
        System.out.println("ID\tName\tSalary");
        for (Person2 person : personSet) {
            System.out.println(person.getId() + "\t" + person.getName() + "\t" + person.getSalary());
        }
    }
}