package org.diginamic.saisons;

import static org.junit.Assert.*;

import org.diginamic.saisons.exceptions.InvalidLibelleException;
import org.diginamic.saisons.exceptions.LibelleNullException;
import org.junit.Before;
import org.junit.Test;

public class SaisonTest {

	private Saison saisonEte;
	private Saison saisonHiver;
	
	@Before
	public void setUp() throws Exception {
		saisonEte = Saison.getSaisonByLibelle("ete");
	}
	
	@Test
	public void testLibelleValide() {
		assertEquals(Saison.ETE, saisonEte);
	}
	
	@Test(expected = InvalidLibelleException.class)
	public void testLibelleInvalide() throws Exception {
		saisonHiver = Saison.getSaisonByLibelle("hivereee");
		assertEquals(Saison.HIVER, saisonHiver);
	}
	
	@Test(expected = LibelleNullException.class)
	public void testLibelleNull() throws Exception {
		assertNotEquals(Saison.HIVER, Saison.getSaisonByLibelle(null));
	}
	
	

}
