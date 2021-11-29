package com.technoelevate.newstandardprograms;

import java.util.ArrayList;

import java.util.ListIterator;

public class ListIteratorPrevious {

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
		ListIterator itr = a1.listIterator(a1.size());

		while (itr.hasPrevious()) {

			SuperHeros hero = (SuperHeros) itr.previous();
			System.out.println(hero.getName() + " uses " + hero.getWeapon());

		}

	}

}
