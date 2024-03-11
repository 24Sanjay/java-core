package com.learning.core.day3;
import java.util.Scanner;
public class D03P06 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        System.out.println("Enter the value of n:");
        int n = scanner.nextInt();
        int vowelCount = countLastNVowels(str, n);
        if (n > vowelCount)
        {
            System.out.println("Mismatch in vowel count");
        } 
    }

    private static int countLastNVowels(String str, int n)
    {
        int count = 0;
        str = str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for (int i = str.length() - 1; i >= 0 && n > 0; i--)
        {
            char currentChar = str.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u')
            {
                count++;
                sb.append(currentChar);
                n--;
            }
        }
        System.out.println(sb.toString()+" ");

        return count;
    }
}
