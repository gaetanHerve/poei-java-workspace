package tpCentraliseur;

public class Centraliseur {
	// Singleton
	private static Centraliseur instance;
	private Imprimante[] imprimantes = new Imprimante[3];
	
	private Centraliseur() {
		this.setImprimantes();
	}
	
	private void setImprimantes() {
		imprimantes[0] = new Imprimante("i1");
		imprimantes[1] = new Imprimante("i2");
		imprimantes[2] = new Imprimante("i3");
	}
	
	static public Centraliseur getInstance() {
		if (instance == null) {
			instance = new Centraliseur();
		}
		return instance;
	}
	
	public boolean print(String toPrint) {
		boolean result = false;
		for (Imprimante i : imprimantes)
			if (!i.isInUse() && !i.isEnPanne()) {
				i.print(toPrint);
				i.setInUse(true);
				result = true;
				break;
			}
		return result;
	}

}
