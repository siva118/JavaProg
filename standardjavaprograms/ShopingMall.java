package com.technoelevate.shoppingmall;
import java.util.ArrayList;
import java.util.Scanner;
public class ShopingMall {
  static  Scanner sc=new Scanner(System.in);
  static  ArrayList<String> list=new ArrayList();
  
	public static void grocery() {
		System.out.println("Enter your Choice : ");
		System.out.println("Choice-1 : Sugar");
		System.out.println("Choice-2 : Milk");
		System.out.println("Choice-3 : Oil");
		System.out.println("Choice-4 : Salt");
		int b=sc.nextInt();
		
		switch(b) {
		case 1:list.add("Sugar");
		break;
		
	    case 2:list.add("Milk");
	    break;
		
    	
        case 3:list.add("Oil");
        break;
		
        
        case 4:list.add("Salt");
        break;
		default:break;
        }
		
        }
	public static void nonVeg() {
		System.out.println("Enter your Choice : ");
		System.out.println("Choice-1 : Chicken");
		System.out.println("Choice-2 : Mutton");
		System.out.println("Choice-3 : Prawns");
		System.out.println("Choice-4 : Eggs");
		int b=sc.nextInt();
		
		switch(b) {
		case 1:list.add("Chicken");
		break;
		
	    case 2:list.add("Mutton");
	    break;
    	
        case 3:list.add("Prawns");
        break;
        
        case 4:list.add("Eggs");
        break;
        default:break;
        }
		
        }
	public static void fruits() {
		System.out.println("Enter your Choice : ");
		System.out.println("Choice-1 : Mango");
		System.out.println("Choice-2 : Orange");
		System.out.println("Choice-3 : Gova");
		System.out.println("Choice-4 : Coconut");
		int b=sc.nextInt();
		
		switch(b) {
		case 1:list.add("Mango");
		break;
		
	    case 2:list.add("Orange");
	    break;
    	
        case 3:list.add("Gova");
        break;
        
        case 4:list.add("Coconut");
        break;
        }
        }
	public static void coolDrinks() {
		System.out.println("Enter your Choice : ");
		System.out.println("Choice-1 : ThumsUp");
		System.out.println("Choice-2 : Soda");
		System.out.println("Choice-3 : Pepsi");
		System.out.println("Choice-4 : Maza");
		int b=sc.nextInt();
		
		switch(b) {
		case 1:list.add("ThumsUp");
		break;
		
	    case 2:list.add("Soda");
	    break;
    	
        case 3:list.add("Pepsi");
        break;
        
        case 4:list.add("Maza");
        break;
        default:break;
        }
        }
	public static void getItem() {
		System.out.println("Enter the index ");
		 try{  
		int d=sc.nextInt();
		System.out.println(	list.get(d));
		 }
		 catch(IndexOutOfBoundsException i)
		 {
			 System.out.println("Enter the valid index.The index between 0 to "+(list.size()-1));
		 }
		
	}
	public static void getItems() {
		for(int i=0;i<list.size();i++) {
			System.out.println(	list.get(i));
				}
		
	}
	public static void removeItem() {
		System.out.println("Enter the index");
		
		try{
			int e=sc.nextInt();
			list.remove(e);
		}
		catch(IndexOutOfBoundsException i) {
			 System.out.println("Enter the valid index.The index between 0 to "+(list.size()-1));
			
		}
		
	}
	public static void replaceItem() {
		System.out.println("Enter the Replacement index");
		try{
			int g=sc.nextInt();
		System.out.println("Enter the Replacement String");
		String s=sc.next();
		
		
		list.remove(g);
		
		list.add(g,s);
		}
		catch(IndexOutOfBoundsException i) {
			 System.out.println("Enter the valid index.The index between 0 to "+(list.size()-1));
			
		}
	}
	public static void addItems() {
		System.out.println("Enter number of items");
		int c=sc.nextInt();
		while(c>0)
		{
		System.out.println("Enter the choice: ");
		System.out.println("Case-1 :nonVeg");
		System.out.println("Case-2 :fruits");
		System.out.println("Case-3 :coolDrinks");
		System.out.println("Case-4 :grocery");
		int i=sc.nextInt();
		
		switch(i) {
		case 1: nonVeg();
		        break;
		case 2:fruits();
		       break;
		case 3:coolDrinks();
		       break;
		case 4:grocery();
		       break;
		default:break;       
		}
		
		c--;
		}
		
	}
	
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println("Welcome to the Shopping Mall");
		System.out.println("Enter your choice");
		System.out.println("Choice-1 : Add the items. ");
		System.out.println("Choice-2 : Display the items ");
		System.out.println("Choice-3 : Display the item");
		System.out.println("Choice-4 : Replace the items");
		System.out.println("Choice-5 : Remove the item");
		System.out.println("Choice-6 : Quit");
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		while(a!=6) {
			switch(a){
			case 1:addItems();
				break;
			case 2:getItems();
				
			
			break;
			case 3:getItem();
				
				break;
			case 4:replaceItem();
				break;
				
				
			case 5:removeItem();
			break;
			
			default:break;	
				
			}
			
			System.out.println("Enter your choice");
			System.out.println("Choice-1 : Add the items. ");
			System.out.println("Choice-2 : Display the items ");
			System.out.println("Choice-3 : Display item");
			System.out.println("Choice-4 : Replace item");
			System.out.println("Choice-5 : Remove item");
			System.out.println("Choice-6 : Quit");
			a=sc.nextInt();
			
			
		}
		System.out.println("Thanks Visit again");
		sc.close();
	}

		
		
		
		
		
		
		
	}

