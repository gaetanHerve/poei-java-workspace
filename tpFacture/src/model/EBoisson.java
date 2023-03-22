package model;

public enum EBoisson {
	petit(1), moyen(2), grand(3); //1litre, 2litres, 3litres
	
	private int volume;
	
	private EBoisson(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}
	
	public String toString() {
		return this.name() + ": " + this.volume + " litre" + (volume > 1 ? "s" : "");
	}
	
}
