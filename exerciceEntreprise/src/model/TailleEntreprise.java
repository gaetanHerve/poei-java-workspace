package model;

public enum TailleEntreprise {
	tpe("TPE", 1, 50), pme("PME", 50, 100), grande("Grande", 100, Integer.MAX_VALUE);
	
	private String nom;
	private int minSalaries;
	private int maxSalaries;
	
	private TailleEntreprise(String nom, int minSalaries, int maxSalaries) {
		this.nom = nom;
		this.minSalaries = minSalaries;
		this.maxSalaries = maxSalaries;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getMinSalaries() {
		return minSalaries;
	}

	public void setMinSalaries(int minSalaries) {
		this.minSalaries = minSalaries;
	}

	public int getMaxSalaries() {
		return maxSalaries;
	}

	public void setMaxSalaries(int maxSalaries) {
		this.maxSalaries = maxSalaries;
	}

}
