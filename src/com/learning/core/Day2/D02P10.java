package com.learning.core.day2;
import java.util.Scanner;
public class D02P10 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int reversednumber =0;
		int digit=0;
	while(a!=0) {
		digit=a%10;
		 reversednumber=reversednumber*10+digit;
		 a/=10;
	}
	System.out.println(reversednumber);
		
	
	}

}
