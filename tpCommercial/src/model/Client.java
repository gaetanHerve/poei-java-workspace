package model;

public class Client {
	private String nom;
	private EPole pole;
	private int nbSalaries;
	
	public Client() {
		
	}
	
	public Client(String nom, EPole pole, int nbSalaries) {
		this.nom = nom;
		this.pole = pole;
		this.nbSalaries = nbSalaries;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", pole=" + pole + ", nbSalaries=" + nbSalaries + "]";
	}
	
}
