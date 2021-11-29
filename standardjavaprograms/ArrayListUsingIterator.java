package com.technoelevate.newstandardprograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListUsingIterator {

	private static ArrayList<SuperHeros> a1 = new ArrayList<SuperHeros>();

	public static void main(String[] args) {
		SuperHeros s1 = new SuperHeros("Dad", "belt.");
		SuperHeros s2 = new SuperHeros("Mom", "broom stick.");
		SuperHeros s3 = new SuperHeros("Sisters", "Sentiment.");
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		getSuperHeros();
	}

	public static void getSuperHeros() {
		Iterator itr = a1.iterator();
		
		while (itr.hasNext()) {
			 
			SuperHeros hero=(SuperHeros) itr.next();
			System.out.println( hero.getName()+" uses "+hero.getWeapon());

		
			
		}

	}

}
