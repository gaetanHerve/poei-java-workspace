package projetPersonnev6;

public class Test {

	public static void main(String[] args) {
		testTP1();
	}
	
	static void testTP1() {
		Personne p1 = new Personne(0, "DUPOND", "avec un D", 35);
		Personne p2 = new Personne(1, "DUPONT", "avec un T", 36);
		Personne p3 = new Personne(1, "DUPONG", "avec un G", 37);
		Groupe g = new Groupe("AJC");
		
		g.add(p1);
		g.add(p2);
		g.add(p3);
		
		System.out.println(g);
		
		System.out.println("-------------Résultats TP-------------");
		
		System.out.println("Nb personnes dans le groupe : " + g.getCount());
		
		String nameToFind = "dupond";
		System.out.println("Personnes s'appellant " + nameToFind + ":\n" + g.getPersonneByNom("DUPOND"));
		
		int ageMin = 36;
		int ageMax = 40;
		System.out.println("Personnes entre " + ageMin + " et " + ageMax + " ans:\n" + g.getPersonneByAge(ageMin, ageMax));
	}

}
