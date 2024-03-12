package com.learning.core.day6;

import java.util.Hashtable;
import java.util.Map.Entry;

public class D06P12 {
	public static void main(String[] args)
	{
		Hashtable<Integer,Employee> ht=new Hashtable<Integer,Employee>();
		Employee e1=new Employee("Daniel","Analyst","L&D");
		Employee e2=new Employee("Thomas","Tester","Testing");
		Employee e3=new Employee("Robert","Product Manager","Development");
		Employee e4=new Employee("Grace","Tech Support","HR");
		ht.put(1001, e1);
		ht.put(1002, e2);
		ht.put(1003, e3);
		ht.put(1004, e4);
		Integer x=1005;
		Employee e5=new Employee("Charles","QA Lead","Testing");
		if(ht.containsKey(x)==false)
		{
			ht.put(x, e5);
		}
		for(Entry<Integer,Employee> e:ht.entrySet())
		{
			System.out.println(e.getKey()+" "+e.getValue());
		}
	}
}