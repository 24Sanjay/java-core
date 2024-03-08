package day02;

import java.util.Scanner;

public class D02P11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int a = sc.nextInt();
        
       
        int n = 0;
        for (int i = 1; i <= a; i++) {
        	n+=1;
            for (int j = 1; j <= i; j++) {
                System.out.print(n + " ");
       
            }
            System.out.println();
        }
    }
}

