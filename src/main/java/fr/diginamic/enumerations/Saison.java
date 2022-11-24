package fr.diginamic.enumerations;
/**
 * Représente une saison et fournit les 4 instances de saisons.
 * 
 * @author Maxence
 *
 */
public enum Saison {

	/** Les 4 instances de Saison */
	PRINTEMPS("Printemps", 1), ETE("Eté", 2), AUTOMNE("Automne", 3), HIVER("Hiver", 4);

	/** libelle des saisons*/
	private String libelle;
	/** ordre des saisons*/
	private int ordre;

	/**
	 * Constructeur
	 * 
	 * @param libelle
	 * @param ordre
	 */
	private Saison(String libelle, int ordre) {
		this.libelle = libelle;
		this.ordre = ordre;
	}

	/**
	 * Rechercher une Saison à partir de son libellé
	 * 
	 * @param libelle
	 * @return saison ou null
	 */
	public static Saison valueOfLibelle(String libelle) {
		Saison[] saisons = Saison.values();
		for (Saison saison : saisons) {
			if (libelle.equals(saison.getLibelle())) {
				return saison;
			}
		}
		return null;
	}
	
	
	
	/**
	 *Methode toString pour afficher ordre et libelle
	 */
	@Override
	public String toString() {
		return ordre + ". " + libelle;
	}

	/**
	 * Getter
	 * 
	 * @return le libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Getter
	 * 
	 * @return l'ordre
	 */
	public int getOrdre() {
		return ordre;
	}
}