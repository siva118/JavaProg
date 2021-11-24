package com.technoelevate.newstandardprograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=sc.nextInt();
		int temp=a;
		int rem=0;
		int sum=0;
		while(a>0) {
			rem=a%10;
			sum+=(rem*rem*rem);
			a/=10;
			}
		if(temp==sum) {
			System.out.println(temp+ " is an armstrong number");
		}
		else {
			System.out.println(temp+ " is  not an armstrong number");
			
		}
		sc.close();
	}

}
