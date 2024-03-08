package day03;
import java.util.Scanner;

public class D03P07{

    public static void Subseq(String str)
    {
        int len = str.length();

        int total = (int) Math.pow(2, len);

        for (int i = 0; i < total; i++)
        {
            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < len; j++)
            {

                if ((i & (1 << j)) != 0)
                {
                    sb.append(str.charAt(j));
                }
            }

            System.out.println(sb);
        }
    }

    public static void main(String[] args) 
    {
    	Scanner sc=new Scanner(System.in);
		String str=sc.next();
        System.out.println(str+" ");
        Subseq(str);
    }
}