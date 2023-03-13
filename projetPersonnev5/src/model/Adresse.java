package model;

public class Adresse {
	private int numero;
	private String rue;
	private String cp;
	
	public Adresse() {
	}

	public Adresse(int numero, String rue, String cp) {
		this.numero = numero;
		this.rue = rue;
		this.cp = cp;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "Adresse [numero=" + numero + ", rue=" + rue + ", cp=" + cp + "]";
	}
	
}
