package com.learning.core.day2;
import  java.util.Scanner;

public class D02P12 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number of rows for the reverse pyramid: ");
        int a = sc.nextInt();
        
        printReversePyramid(a);
    }
    
    public static void printReversePyramid(int a) {
        for (int i = a; i >= 1; i--) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print("  "); // Print spaces to align the pyramid
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("* "); // Print asterisks
            }
            System.out.println(); // Move to the next line
        }
    }
}