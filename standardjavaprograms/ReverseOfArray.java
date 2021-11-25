package com.technoelevate.newstandardprograms;

import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number");
		int b=sc.nextInt();
		System.out.println("Enter the "+b+" Numbers");
		int[] a=new int[b];
		
		for(int i=0;i<b;i++) {
			a[i]=sc.nextInt();
		}
		for(int j=b-1;j>=0;j--) {
			System.out.println( a[j]);
			
	}
		sc.close();
		

}
}
