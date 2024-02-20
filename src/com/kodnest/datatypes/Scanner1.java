package com.kodnest.datatypes;
import java.util.Scanner;
public class Scanner1 {
         void dis(String s,char c) {
        	         	 
        	 System.out.println(s);
        	 System.out.println("display char at given String");
        	 System.out.println(c);
        	 
         }
	public static void main(String[] args) {
		Scanner1 s=new Scanner1();
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter string");
//		String s1=sc.nextLine();
//		char c=s1.charAt(0);
//		s.dis(s1,c);
//		System.out.println("enter double value");
//		double b=sc.nextDouble();
//		System.out.println(b);
//		System.out.println("enter short value");
//		short e=sc.nextShort();
//		System.out.println(e);
//		System.out.println("enter short long");
//		long l=sc.nextLong();
//		System.out.println(l);
//		System.out.println("enter float value");
//		float f=sc.nextFloat();
//		System.out.println(f);
//		 int a,b,c;
//		 System.out.println("enter a value");
//		 
//		 a=sc.nextInt();
//		 System.out.println("enter b value");
//		 b=sc.nextInt();
//		 
//		 System.out.println(a+b);
//		 System.out.println(a-b);
//		 System.out.println(a*b);
//		 System.out.println(a/b);
//		 System.out.println(a%b);
		System.out.println(5&2);
		System.out.println(5|2);
		sc.close();
	}

}
