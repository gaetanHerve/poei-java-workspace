package model;

public class Client {
	private String nom;
	private String prenom;
	private Info info;
	private Compte compte;
	
	public Client() {}
	
	public Client(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Client(String nom, String prenom, Info info) {
		this.nom = nom;
		this.prenom = prenom;
		this.info = info;
	}

	public Client(String nom, String prenom, Compte compte) {
		this.nom = nom;
		this.prenom = prenom;
		this.compte = compte;
	}

	public Client(String nom, String prenom, Info info, Compte compte) {
		this.nom = nom;
		this.prenom = prenom;
		this.info = info;
		this.compte = compte;
	}
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	@Override
	public String toString() {
		String str = "Client [nom=" + nom + ", prenom=" + prenom + "]";
		if (info != null) str+= "\n" + info;
		if (compte != null) str+= "\n" + compte;
		return str;
	}

}
