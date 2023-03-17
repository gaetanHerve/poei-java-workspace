package user;

import model.*;

public class Test {
	public static void main(String[] args) {
		testTpComptev3();
	}
	
	static void testTpComptev3() {
		CompteSimple c1 = new CompteSimple("Compte simple", 500);
		CompteCB cb1 = new CompteCB("Compte CB", 600, CB.visa);
		CompteVIP cVip = new CompteVIP("Compte VIP");
		
		String refuse = "Opération refusée";
		
		System.out.println("comptes à la création :");
		System.out.println(cb1);
		System.out.println(cVip);
		
		System.out.println("---------------------------");
		System.out.println("On débite " + cVip.getTitulaire() + " de 500 euros");
		System.out.println(cVip.debiter(500) ? "compte débité" : refuse);
		System.out.println(cVip);
		
		
		System.out.println("---------------------------");
		System.out.println(cVip.getTitulaire() + " fait un virement de 20 euros vers " + c1.getTitulaire());
		System.out.println(cVip.virement(20, c1) ? "virement effectué" : refuse);
		System.out.println(cVip);
		System.out.println(c1);
		
		System.out.println("---------------------------");
		System.out.println(cVip.getTitulaire() + " reçoit un virement de 500 euros depuis " + cb1.getTitulaire());
		System.out.println(cb1.virement(500, cVip) ? "virement effectué" : refuse);
		System.out.println(cVip);
		System.out.println(cb1);
	}
	
}
