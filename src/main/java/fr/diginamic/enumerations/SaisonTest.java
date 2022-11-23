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
		fail("Not yet implemented");
	}

	@Test
	public void testGetLibelle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetOrdre() {
		fail("Not yet implemented");
	}

}
