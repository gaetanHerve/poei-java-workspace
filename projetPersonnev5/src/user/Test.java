package user;

import model.Personne;
import model.Adresse;

public class Test {

	public static void main(String[] args) {
		test3();
	}
	
	private static void test3() {
		Adresse a = new Adresse(19, "rue de Paris", "75001");
		Personne p = new Personne("DUPOND", "avec un D", 25, a);
		System.out.println(p);
		
		// tout part de p
		// on récupère le nom
		
		System.out.println(p.getNom());
		
		// on récupère le n° de la rue
		System.out.println(p.getAdresse().getNumero());
		
		// depuis p, modifier le cp
		p.getAdresse().setCp("54000");
		
		System.out.println(p);
		
	}
	
	private static void test1() {
		Personne p1 = new Personne("DUPOND", "avec un D", 25);
		System.out.println(p1);
		
		Adresse a1 = new Adresse(19, "rue de Paris", "75001");
		p1.setAdresse(a1);
		System.out.println(p1);
	}

}
