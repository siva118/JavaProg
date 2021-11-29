package com.technoelevate.newstandardprograms;

import java.util.ArrayList;

public class ArrayListUsingForLLoop {
	
	
	
	
	private static ArrayList<SuperHeros> a1=new ArrayList<SuperHeros>();
	public static void main(String[] args) {
		SuperHeros s1=new SuperHeros("Dad","belt.");
		SuperHeros s2=new SuperHeros("Mom","broom stick.");
		SuperHeros s3=new SuperHeros("Sisters","Sentiment.");
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		getSuperHeros();
		 }
	public static void getSuperHeros(){
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i).getName()+" uses "+a1.get(i).getWeapon());
			
		}
		
		
	}

}
