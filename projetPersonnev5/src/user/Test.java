package user;

import model.Personne;
import model.Adresse;

public class Test {

	public static void main(String[] args) {
		test1();
	}
	
	private static void test1() {
		Personne p1 = new Personne("DUPOND", "avec un D", 25);
		Adresse a1 = new Adresse(19, "rue de Paris", "75001");
		p1.setAdresse(a1);
		System.out.println(p1);
	}

}
