package tpObserver;

public class Prof {
	private String nom;
	private Eleve[] eleves = new Eleve[18];
	private int note;
	
	public Prof() {}
	
	public Prof(String nom) {
		this.nom = nom;
	}
	
	public void abo(Eleve eleve) {
		for (int i = 0; i < eleves.length; i++) {
			if (eleves[i] == null) {
				eleves[i] = eleve;
				break;
			}
		}
	}
	
	private void notifAll() {
		for (Eleve e : eleves) {
			if (e != null) {
				e.notif();
			}
		}
	}
	
	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
		notifAll();
	}

	@Override
	public String toString() {
		return "Prof [nom=" + nom + "]";
	}

}
