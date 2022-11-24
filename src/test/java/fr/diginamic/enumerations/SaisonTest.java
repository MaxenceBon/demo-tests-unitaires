package fr.diginamic.enumerations;

import static org.junit.Assert.*;

import org.junit.Test;

public class SaisonTest {

	@Test
	public void testValueOfLibelle() {
		 Saison s1= Saison.valueOfLibelle("Automne");
		 assertEquals(Saison.AUTOMNE, s1);
	}

	@Test
	public void testToString() {
		String saisonString = "3. Automne";
		assertEquals(Saison.AUTOMNE.toString(), saisonString);
	}

	@Test
	public void testGetLibelle() {
		String saisonLibelle = "Automne";
		assertEquals(Saison.AUTOMNE.getLibelle(), saisonLibelle);
	}

	@Test
	public void testGetOrdre() {
		int saisonOrdre = 3;
		assertEquals(Saison.AUTOMNE.getOrdre(), saisonOrdre);
	}

}
