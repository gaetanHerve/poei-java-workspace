package tpVille;

public class Ville {

	String nom;
	String pays;
	Double nbHbts;
	
	Ville() {}
	
	Ville(String nom, String pays, Double nbHbts) {
		this.nom = nom;
		this.pays = pays;
		this.nbHbts = nbHbts;
	}
	
	String getInfos() {
		return this.nom + ", " + this.pays + ", " + this.nbHbts + " millions d'habitants";
	}
}
