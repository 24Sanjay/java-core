package day02;
import java.util.Scanner;

public class D02P09 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for (int i=1;i<=a;i+=1) {
			int c=i*i*i;
			System.out.println(c);
		}
		
	}

}
