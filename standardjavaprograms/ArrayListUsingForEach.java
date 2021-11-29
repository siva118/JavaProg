package com.technoelevate.newstandardprograms;

import java.util.ArrayList;

public class ArrayListUsingForEach {

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
		for (SuperHeros hero : a1) {
			System.out.println(hero.getName() + " uses " + hero.getWeapon());

		}

	}

}
