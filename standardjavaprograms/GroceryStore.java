package com.technoelevate.shoppingmall;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class GroceryStore {
	
	
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	System.out.println("Welcome to the Shopping Mall");
	System.out.println("Enter your choice");
	System.out.println("Choice-1 : Add the items. ");
	System.out.println("Choice-2 : Display the items ");
	System.out.println("Choice-3 : Replace the items");
	System.out.println("Choice-4 : Remove the items");
	System.out.println("Choice-5 : Display the item");
	System.out.println("Choice-6 : Quit");
	Scanner sc=new Scanner(System.in);
	
	int a=sc.nextInt();
	while(a!=6) {
		switch(a){
		case 1:System.out.println("Enter number of items");
			int c=sc.nextInt();
			while(c>0)
			{
			System.out.println("Enter the item");	
			String b=sc.next();
			list.add(b);
			c--;
			}
			break;
		case 2:
			for(int i=0;i<list.size();i++) {
		System.out.println(	list.get(i));
			}
		
		break;
		case 3:	System.out.println("Enter the index ");
		    int d=sc.nextInt();
			System.out.println(	list.get(d));
			break;
		case 4:System.out.println("Enter the Replacement inex");
			int g=sc.nextInt();
			System.out.println("Enter the Repacement String");
			String s=sc.next();
			list.remove(g);
			list.add(g, s);
			break;
			
			
		case 5:System.out.println("Enter the index");
		int e=sc.nextInt();
		list.remove(e);
		break;
		
		default:	
			
		}
		System.out.println("Enter the choice: ");
		a=sc.nextInt();
		
	}
	System.out.println("Thanks Visit again");
	sc.close();
}

}
