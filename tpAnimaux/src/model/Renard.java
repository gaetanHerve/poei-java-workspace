package model;

public class Renard extends Animal {
	private String proie;
	
	public Renard(String nom) {
		super(nom);
	}

	public String getProie() {
		return proie;
	}

	public void setProie(String proie) {
		this.proie = proie;
	}
	
	public String cri() {
		return "KAI";
	}

	@Override
	public String toString() {
		return super.toString() + ", proie=" + proie;
	}
	
	
	
}
