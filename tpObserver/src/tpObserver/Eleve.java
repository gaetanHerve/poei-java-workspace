package tpObserver;

public class Eleve {
	private String nom;
	private Prof prof;
	private int note;
	
	public Eleve() {}
	
	public Eleve(String nom) {
		this.nom = nom;
	}
	
	private void setNote(int note) {
		this.note = note;
	}

	public void setProf(Prof prof) {
		this.prof = prof;
	}

	public void notif() {
		this.setNote(prof.getNote());
	}

	@Override
	public String toString() {
		return "Eleve [nom=" + nom + ", prof=" + prof + ", note=" + note + "]";
	}

}
