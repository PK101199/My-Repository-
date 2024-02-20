package com.kodnest.datatypes;

public class Ex1 {

	public static void main(String[] args) {
		
     int s=25;
     int c=1;
     for(int i=2;i<=s;i++) {
    	  int d=0;
    	 if(s%i==0) {
    		 d++;
    	 } 
    	 c+=d;
     }
     if(c==2) {
		 System.out.println("p");
	 }
     else System.out.println("np");
	}

}
