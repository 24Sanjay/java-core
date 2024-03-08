package day02;
import java.util.Scanner;
public class D02P07 {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the total marks: ");
        double totalMarks = sc.nextDouble();
        
        System.out.print("Enter the marks obtained by the student: ");
        double marksObtained = sc.nextDouble();
        
        double percentage = (marksObtained / totalMarks) * 100;
        String result=(percentage>=0&&percentage<=100)?percentage>=65?"Grade A":percentage>=45?"Grade B":percentage>=35?"Grade C": "Fail":"Percentage should be between 0 and 100";
        System.out.println(result);
	}
	

}
