package com.learning.core.day3;

import java.util.Scanner;

public class D03P02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int num1, num2;
        do {
            System.out.print("Enter the first number (1-40): ");
            num1 = scanner.nextInt();
        } while (num1 < 1 || num1 > 40);

        do {
            System.out.print("Enter the second number (1-40): ");
            num2 = scanner.nextInt();
        } while (num2 < 1 || num2 > 40);

        int[] array = new int[5];
        System.out.println("Enter 5 numbers (1-40) for the array:");
        for (int i = 0; i < 5; i++) {
            do {
                System.out.print("Enter number " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            } while (array[i] < 1 || array[i] > 40);
        }

        boolean found1 = false;
        boolean found2 = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num1) {
                found1 = true;
            }
            if (array[i] == num2) {
                found2 = true;
            }
        }

       
        if (found1 && found2) {
            System.out.println("Bingo");
        } else {
            System.out.println("Numbers not found in the array");
        }

        scanner.close();
    }}