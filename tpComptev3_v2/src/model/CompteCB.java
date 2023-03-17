package model;

public class CompteCB extends CompteSimple {
	private CB cb;
	
	public CompteCB(String titulaire, CB cb) {
		super(titulaire);
		this.cb = cb;
		cbCotisation();
	}
	
	public CompteCB(String titulaire, int solde, CB cb) {
		super(titulaire, solde);
		this.cb = cb;
		cbCotisation();
	}
	
	private void cbCotisation() {
		this.solde -= this.cb.getPrix();
	}

	@Override
	public String toString() {
		return super.toString() +" cb=" + cb;
	}

}
