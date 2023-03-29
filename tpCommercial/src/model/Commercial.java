package model;

import java.util.Objects;

public class Commercial {
	private String nom;
	private int secu;
	
	public Commercial(int secu) {
		this.secu = secu;
	}
	
	public Commercial(String nom, int secu) {
		this.nom = nom;
		this.secu = secu;
	}
	
	public String getNom() {
		return nom;
	}

	public int getSecu() {
		return secu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(secu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commercial other = (Commercial) obj;
		return secu == other.secu;
	}

	@Override
	public String toString() {
		return "Commercial [nom=" + nom + ", secu=" + secu + "]";
	}
	
}
