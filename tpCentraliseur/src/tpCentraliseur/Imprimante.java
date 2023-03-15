package tpCentraliseur;

public class Imprimante {
	private String nom;
	private boolean inUse;
	private boolean enPanne;
	
	public Imprimante() {}
	
	public Imprimante(String nom) {
		this.nom = nom;
	}

	public boolean isInUse() {
		return inUse;
	}

	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}

	public boolean isEnPanne() {
		return enPanne;
	}

	public void setEnPanne(boolean enPanne) {
		this.enPanne = enPanne;
	}

	public boolean print(String toPrint) {
		boolean printed = false;
		if (!inUse && !enPanne) {
			System.out.println("printing: " + toPrint + " sur l'imprimante " + nom);
			printed = true;
		}
		return printed;
	}

	@Override
	public String toString() {
		return "Imprimante [nom=" + nom + ", inUse=" + inUse + ", enPanne=" + enPanne + "]";
	}
	
}
