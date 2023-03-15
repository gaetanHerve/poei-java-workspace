package tpCentraliseur;

public class Poste {
	private String nom;
	private Centraliseur centraliseur;
	
	public Poste(String nom, Centraliseur centraliseur) {
		this.nom = nom;
		this.centraliseur = centraliseur;
	}

	public boolean print(String toPrint) {
		this.centraliseur.print(toPrint);
		return false;
	}
}
