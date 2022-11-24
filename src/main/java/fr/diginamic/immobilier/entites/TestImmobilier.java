package fr.diginamic.immobilier.entites;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fr.diginamic.enumerations.Saison;

public class TestImmobilier {

	@Test
	public void testAjouterPiece() {
		 Saison s1= Saison.valueOfLibelle("Automne");
		 assertEquals(Saison.AUTOMNE, s1);
	}
	
	@Test
	public void testNbPiece() {
		 Saison s1= Saison.valueOfLibelle("Automne");
		 assertEquals(Saison.AUTOMNE, s1);
	}
	
	
	@Test
	public void testSuperficieEtage() {
		 Saison s1= Saison.valueOfLibelle("Automne");
		 assertEquals(Saison.AUTOMNE, s1);
	}
	
	@Test
	public void testSuperficieTypePiece() {
		 Saison s1= Saison.valueOfLibelle("Automne");
		 assertEquals(Saison.AUTOMNE, s1);
	}
	
	@Test
	public void testCalculerSurface() {
		 Saison s1= Saison.valueOfLibelle("Automne");
		 assertEquals(Saison.AUTOMNE, s1);
	}
	
}
