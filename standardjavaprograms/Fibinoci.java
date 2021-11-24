package com.technoelevate.newstandardprograms;

import java.util.Scanner;

public class Fibinoci {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range");
		int r=sc.nextInt();
		int n1=0,n2=1,n3=0;
		System.out.print(n1+" "+n2);
		for(int i=2;i<=r;i++) {
			n3=n1+n2;
			n2=n3;
			n1=n2;
			System.out.print(" "+n3);
			
		}
		sc.close();
	}

}
