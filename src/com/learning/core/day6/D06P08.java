package com.learning.core.day6;

import java.util.*;

class Car4 implements Comparable<Car4> {
    private String name;
    private double price;

    public Car4(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car4 car = (Car4) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car4 otherCar) {
        return Double.compare(this.price, otherCar.price);
    }
}

public class D06P08 {
    public static void main(String[] args) {
        
        TreeMap<Car4, String> carDetails = new TreeMap<>();

       
        carDetails.put(new Car4("Bugatti", 80050.0), "1");
        carDetails.put(new Car4("Swift", 305000.0), "2");
        carDetails.put(new Car4("Audi", 600100.0), "3");
        carDetails.put(new Car4("Benz", 900000.0), "4");

        
        Map.Entry<Car4, String> greatestEntry = carDetails.pollLastEntry();
        System.out.println("Car with the greatest price removed: " + greatestEntry.getValue() + ". " + greatestEntry.getKey());

        
        System.out.println("Updated Car Details after removal:");
        for (Map.Entry<Car4, String> entry : carDetails.entrySet()) {
            System.out.println(entry.getValue() + ". " + entry.getKey());
        }
    }
}