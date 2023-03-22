package projetTrierTableau;

import java.util.Comparator;

public class ComparePrenom implements Comparator<Personne> {

	@Override
	public int compare(Personne o1, Personne o2) {
		// TODO Auto-generated method stub
		return o1.getPrenom().compareTo(o2.getPrenom());
	}

}
