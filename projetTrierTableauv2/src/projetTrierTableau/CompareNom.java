package projetTrierTableau;

import java.util.Comparator;

public class CompareNom implements Comparator<Personne> {

	@Override
	public int compare(Personne o1, Personne o2) {
		// TODO Auto-generated method stub
		return o1.getNom().compareTo(o2.getNom());
	}

}
