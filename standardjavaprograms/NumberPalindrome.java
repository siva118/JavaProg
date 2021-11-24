package com.technoelevate.newstandardprograms;

import java.util.Scanner;

public class NumberPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int sum=0;
		int temp=a;
		while(a>0) {
			sum=sum*10+(a%10);
			a/=10;
			
		}
		if(temp==sum) {
			System.out.println("The number "+temp+" is a palindrome");
		}
		else {
			System.out.println("The number "+temp+" is not a palindrome");
		}
		sc.close();
	}

}
