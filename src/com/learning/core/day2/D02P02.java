package com.learning.core.day2;
import java.util.Scanner;
public class D02P02 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(n);
		int i=2;
		
		if (n < 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        if (n >= 2) {
            while(i<=n){
                System.out.println(i);
                i+=2;
            }
        }
        else {
            System.out.println("There are no even numbers up to " + n);
        }
	
	}
}
