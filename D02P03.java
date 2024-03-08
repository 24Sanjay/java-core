package day02;
import java.util.Scanner;

public class D02P03 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int  b=sc.nextInt();
		char operator = sc.next().charAt(0);
		int n = 0;
		
	switch(operator){
		case('+'):
			n=a+b;
			break;
		
		case '-' :
			n=a-b;
			break;
		
		case '*' :
			n=a* b;
			break;
		
		case '/' :
			n=a/b;
			break;
		
		}
		System.out.println(n);
	}
}
