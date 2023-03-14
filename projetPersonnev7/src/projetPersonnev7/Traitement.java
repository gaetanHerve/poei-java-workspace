package projetPersonnev7;

public class Traitement {
	
	public static void m1() {
		System.out.println("Je suis m1 de Traitement");
	}
	
	public static void m2() {
		System.out.println("Je suis m2 de Traitement");
	}
	
	public void m3() {
		m2();
		System.out.println("Je suis m3 de Traitement");
	}
	
	public void m4() {
		System.out.println("Je suis m4 de Traitement");
	}
	
}
