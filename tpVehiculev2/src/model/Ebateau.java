package model;

public enum Ebateau {
	petit(2),
	moyen(4),
	grand(10);
	
	private int nbPlaces;
	
	private Ebateau() {}
	
	private Ebateau(int nbPlaces) {
		this.nbPlaces = nbPlaces;
	}

	public int getNbPlaces() {
		return nbPlaces;
	}
	
}
