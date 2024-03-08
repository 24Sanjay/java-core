package day05;
import java.util.Objects;
import java.util.TreeSet;

class Prsn implements Comparable<Prsn> {
    private int id;
    private String name;
    private int age;
    private double salary;
    

    public Prsn(int id, String name, int age, double salary) {
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
        Prsn person = (Prsn) obj;
        return id == person.id;
    }

    @Override
    public int compareTo(Prsn other) {
        return Integer.compare(this.id, other.id);
    }
}

public class D05P09 {
    public static void main(String[] args) {
        // Creating Person objects
        Person person1 = new Person(1, "Alice", 30,1999);
        Person person2 = new Person(2, "Bob", 25, 3999);
        Person person3 = new Person(3, "Charlie", 35,999);
        Person person4 = new Person(4, "David", 20, 6999);
        Person person5 = new Person(5, "Eve", 28, 5999);
        Person person6 = new Person(6, "Frank", 40, 2999);

        // Storing persons in a TreeSet
        TreeSet<Person> personSet = new TreeSet<>();
        personSet.add(person1);
        personSet.add(person2);
        personSet.add(person3);
        personSet.add(person4);
        personSet.add(person5);
        personSet.add(person6);

        // Calculating the sum of all salaries
        double totalSalary = 0;
        for (Person person : personSet) {
            totalSalary += person.getSalary();
        }

        // Printing the sum of all salaries
        System.out.println("Sum of all salaries: " + totalSalary);
    }
}