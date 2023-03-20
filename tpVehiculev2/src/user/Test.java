package user;

import model.*;

public class Test {

	public static void main(String[] args) {
		test7();
	}
	
	static void test7() {
		
	}
	
	static void test6() {
		Voiture vehicule = new Voiture("vehiculeA", 320);
		Voiture voiture = new Voiture("voitureB", 230);
		Velo velo = new Velo("veloC", 300);
		Bateau bateau = new Bateau("bateauD", 600, Ebateau.grand);
		
		testAvancer(vehicule);
		testAvancer(voiture);
		testAvancer(velo);
		testAvancer(bateau);
	}
	
	static void testAvancer(Vehicule v) {
		System.out.println(v.avancer());
	}
	
	static void testObject() {
		Object tab[] = {11, "toto", new Voiture("test", 0)};
		for ( Object object : tab) {
			System.out.println(object);
		}
	}
	
	static void test3() {
		Voiture v1 = new Voiture("xxx", 200);
		v1.gpsOnOff();
		Vehicule v2 = v1;
		Object v3 = v1;
		System.out.println(v2);
		System.out.println(v3);
	}
	
    static void test2() {
        Vehicule[] tab = { new Voiture("aa", 10), new Voiture("bb", 20), new Velo("cc", 30),
    	        new Bateau("dd", 40, Ebateau.grand) };

        for (Vehicule v : tab)
            System.out.println(v.avancer());
        System.out.println("----------------------------");
        for (Vehicule v : tab)
            System.out.println(v);

    }
	
	
	static void testTpVehiculev2() {
		Velo velo = new Velo("Specialized", 300);
		Voiture voiture = new Voiture("Renault", 230);
		Bateau bateau = new Bateau("Titanic", 600, Ebateau.grand);
		
		System.out.println(velo);
		System.out.println(velo.avancer());
		System.out.println("------------------");
		System.out.println(bateau);
		System.out.println(bateau.avancer());
		System.out.println("le bateau rencontre un iceberg");
		bateau.meetIceberg();
		System.out.println(bateau.avancer());
		System.out.println("------------------");
		System.out.println(voiture);
		System.out.println(voiture.avancer());
		System.out.println("on active le gps");
		voiture.gpsOnOff();
		System.out.println(voiture);
	}

}
