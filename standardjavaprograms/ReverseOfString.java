package com.technoelevate.newstandardprograms;

import java.util.Scanner;

public class ReverseOfString {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);;
		System.out.println("Enter the String");
		String s1=sc.next();
		String s2="";
		for(int i=0;i<s1.length();i++) {
			s2=s1.charAt(i)+s2;
		}
		System.out.println("The actual string is "+s1);
		System.out.println("The Reverse string is "+s2);
		sc.close();
		
	}

}
