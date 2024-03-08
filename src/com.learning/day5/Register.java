package day05;

import java.util.Scanner;



public class Register <T>
{  T obj;
    String registerid;

   public Register(T obj) 
   {
	super();
	this.obj = obj;
   }
public String genertaeRegisterId(T obj)
   {   String res=null;
	 if(obj instanceof Employee || obj instanceof Student)
   
   {
	   Scanner sc = new Scanner(System.in);
       System.out.println("enter length of random number");
       int n= sc.nextInt();
	   String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvwxyz";
       StringBuilder sb = new StringBuilder(n);

       for (int i = 0; i < n; i++) {
           int index = (int)(AlphaNumericString.length() * Math.random());
           sb.append(AlphaNumericString.charAt(index));
       }
   
     res = sb.toString();
        
   }
	 return res;
   }
}