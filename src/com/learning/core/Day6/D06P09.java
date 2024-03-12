package com.learning.core.day6;
import java.util.Objects;
import java.util.TreeMap;

class Cars implements Comparable<Cars> {
    private String name;
    private double price;

    public Cars(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and Setters

    @Override
    public String toString() {
        return "Car: " + name + ", Price: $" + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cars car = (Cars) obj;
        return Double.compare(car.price, price) == 0 &&
                Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Cars other) {
        return this.name.compareTo(other.name);
    }
}

public class D06P09 {
    public static void main(String[] args) {
        // Create cars
        Cars car1 = new Cars("Toyota", 25000);
        Cars car2 = new Cars("Honda", 28000);
        Cars car3 = new Cars("Ford", 30000);
        Cars car4 = new Cars("Chevrolet", 27000);

        // Store cars in TreeMap
        TreeMap<String, Cars> carMap = new TreeMap<>();
        carMap.put(car1.toString(), car1);
        carMap.put(car2.toString(), car2);
        carMap.put(car3.toString(), car3);
        carMap.put(car4.toString(), car4);

        // Replace the value mapped by a specific key with a new value and print key and new value
        String keyToReplace = "Car: Toyota, Price: $25000"; // Example key to replace
        if (carMap.containsKey(keyToReplace)) {
            Cars newCar = new Cars("Toyota", 27000); // New value
            carMap.put(keyToReplace, newCar);
            System.out.println("Updated Car Details:");
            System.out.println(keyToReplace + " => " + newCar);
        }
    }
}