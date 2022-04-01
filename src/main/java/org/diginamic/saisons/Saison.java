package org.diginamic.saisons;

import org.diginamic.saisons.exceptions.InvalidLibelleException;
import org.diginamic.saisons.exceptions.LibelleNullException;

public enum Saison {

	PRINTEMPS("printemps", 1),
	ETE("ete", 2),
	AUTOMNE("automne", 3),
	HIVER("hiver", 4);
	
	private String libelle;
	private int ordre;
	
	Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getOrdre() {
		return ordre;
	}

	public void setOrdre(int ordre) {
		this.ordre = ordre;
	}
	
	public static Saison getSaisonByLibelle(String libelle) throws LibelleNullException, InvalidLibelleException {
		if (libelle == null) {
			throw new LibelleNullException();
		}
		if (libelle == "printemps") {
			return PRINTEMPS;
		}
		if (libelle == "ete") {
			return ETE;
		}
		if (libelle == "automne") {
			return AUTOMNE;
		}
		if (libelle == "hiver") {
			return HIVER;
		}
		
		
		throw new InvalidLibelleException();
	}
	
}
