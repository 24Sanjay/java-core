package com.learning.core.day6;

import java.util.*;

class Car3 implements Comparable<Car3> {
    private String name;
    private double price;

    public Car3(String name, double price) {
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
        Car3 car = (Car3) obj;
        return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int compareTo(Car3 otherCar) {
        return Double.compare(this.price, otherCar.price);
    }
}

public class D06P07 {
    public static void main(String[] args) {
       
        TreeMap<Car3, String> carDetails = new TreeMap<>();

        
        carDetails.put(new Car3("Bugatti", 80050.0), "1");
        carDetails.put(new Car3("Swift", 305000.0), "2");
        carDetails.put(new Car3("Audi", 600100.0), "3");
        carDetails.put(new Car3("Benz", 900000.0), "4");

       
        Map.Entry<Car3, String> greatestEntry = carDetails.lastEntry();
        System.out.println("Car with the greatest price: " + greatestEntry.getValue() + ". " + greatestEntry.getKey());

       
        Map.Entry<Car3, String> leastEntry = carDetails.firstEntry();
        System.out.println("Car with the least price: " + leastEntry.getValue() + ". " + leastEntry.getKey());
    }
}
