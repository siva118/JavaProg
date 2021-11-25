package com.technoelevate.newstandardprograms;

import java.util.Scanner;

public class ReverseOfNumber {
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
			System.out.println("The actual number is "+temp+". The Reverse number is "+sum);
			sc.close();
		}
}
	


