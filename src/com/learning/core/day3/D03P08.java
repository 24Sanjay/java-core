package com.learning.core.day3;

import java.util.Scanner;

public class D03P08 {
	public static void palindrome(String str) {
        int n = str.length();
        int[][] ar = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {
            ar[i][i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    ar[i][j] = ar[i + 1][j - 1] + 2;
                } else {
                    ar[i][j] = Math.max(ar[i + 1][j], ar[i][j - 1]);
                }
            }
        }

        System.out.println( n - ar[0][n - 1]);
    }
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		palindrome(s);
		
		
	}

}