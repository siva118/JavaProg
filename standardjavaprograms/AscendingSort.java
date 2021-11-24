package com.technoelevate.newstandardprograms;

import java.util.Scanner;

public class AscendingSort {
	

	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array lenght");
			int l=sc.nextInt();
			int[] a=new int[l];
			System.out.println("Enter the array");
			int temp=0;
			for(int i=0;i<l;i++) {
				a[i]=sc.nextInt();
				}
			for(int i=0;i<l;i++) {
				for(int j=i+1;j<l;j++) {
					if(a[i]>a[j]) {
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						}
				}
			}
			for(int i=0;i<l;i++) {
				System.out.println(a[i]);
				}
			sc.close();
		}

	}


