package fr.diginamic.utils;

import static org.junit.Assert.*;

import org.junit.Test;


public class DemoStringUtils {

	@Test
	public void testLevenshteinDistance() {
		 int testLevenshteinDistance1 = 2;
		 assertEquals(StringUtils.levenshteinDistance("Chine", "Chien"), testLevenshteinDistance1);
		 int testLevenshteinDistance2 = 2;
		 assertEquals(StringUtils.levenshteinDistance("Vienne", "Sienne"), testLevenshteinDistance2);
		 int testLevenshteinDistance3 = 2;
		 assertEquals(StringUtils.levenshteinDistance("Distance", "Instance"), testLevenshteinDistance3);
	}
	
	@Test
	public void testLevenshteinDistanceNull() {
		int testLevenshteinDistance4 = 1;
		assertEquals(StringUtils.levenshteinDistance("Chine", null), testLevenshteinDistance4);
	}
	
	
	public static void main(String[] args) {
	
		//TODO La classe semble fonctionne mais fonctionne t'elle si bien que ça ??
		//TODO Que se passe t'il si on lui passe des paramètres inattendus.
		//TODO Mettre en place des tests unitaires permettant de vérifier que la classe fonctionne
		//     dans tous les cas
		

		System.out.println(StringUtils.levenshteinDistance("Chine", "Chien"));
		System.out.println(StringUtils.levenshteinDistance("Vienne", "Sienne"));
	
	}

}
