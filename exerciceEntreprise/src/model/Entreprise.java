package model;

public class Entreprise {
	protected String nom;
	protected double capital;
	protected TailleEntreprise taille;
	protected Domaine domaine;
	protected boolean faillite;
	
	public Entreprise() {
		
	}
	
	public Entreprise(String nom, TailleEntreprise taille, Domaine domaine) {
		this.nom = nom;
		this.taille = taille;
		this.domaine = domaine;
	}

	public Entreprise(String nom, double capital, TailleEntreprise taille, Domaine domaine) {
		this.nom = nom;
		this.capital = capital;
		this.taille = taille;
		this.domaine = domaine;
	}
	
	public void perteArgent(double somme) {
		this.capital -= somme;
		this.faillite = this.capital < 0;
	}
	
	public void gagneArgent(double somme) {
		double gain = applyTaxe(somme);
		this.capital += gain;
		this.faillite = this.capital < 0;
	}
	
	public double applyTaxe(double somme) {
		return (somme - somme * this.domaine.getTaxe()/100);
	}
	
	public void commissionne(double somme, Entreprise autreEntreprise) {
		this.perteArgent(somme);
		autreEntreprise.gagneArgent(somme);
	}

	@Override
	public String toString() {
		return "Entreprise [nom=" + nom + ", capital=" + capital + ", taille=" + taille.getNom() + ", domaine=" + domaine
				+ ", faillite=" + faillite + "]";
	}
	
}
