package user;

import model.*;

public class Test {
	public static void main(String[] args) {
		// testTpComptev1();
		// testTpComptev2();
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
	
	static void testTpComptev2() {
		CompteSimple c1 = new CompteSimple("Compte simple 1", 500);
		CompteCB cb1 = new CompteCB("Compte CB 1", CB.visa);
		CompteCB cb2 = new CompteCB("Compte CB 2", 500, CB.amex);
		
		String refuse = "Opération refusée";
		
		System.out.println("comptes à la création :");
		System.out.println(cb1);
		System.out.println(cb2);
		
		System.out.println("---------------------------");
		System.out.println(cb1.getTitulaire() + " est débité de 10 euros");
		System.out.println(cb1.debiter(10) ? "compte débité" : refuse);
		System.out.println(cb1);
		
		System.out.println("---------------------------");
		System.out.println(cb2.getTitulaire() + " est crédité de 50 euros");
		System.out.println(cb2.crediter(50) ? "compte crédité" : refuse);
		System.out.println(cb2);
		
		System.out.println("---------------------------");
		System.out.println(cb2.getTitulaire() + " fait un virement de 20 euros vers " + cb1.getTitulaire());
		System.out.println(cb2.virement(20, cb1) ? "virement effectué" : refuse);
		System.out.println(cb1);
		System.out.println(cb2);
		
		System.out.println("---------------------------");
		System.out.println("On tente de débiter " + cb1.getTitulaire() + " de 30 euros");
		System.out.println(cb1.debiter(30) ? "compte débité" : refuse);
		System.out.println(cb1);
		
		System.out.println("---------------------------");
		System.out.println(c1.getTitulaire() + " fait un virement de 20 euros vers " + cb1.getTitulaire());
		System.out.println(c1.virement(20, cb1) ? "virement effectué" : refuse);
		System.out.println(c1);
		System.out.println(cb1);
		
		System.out.println("---------------------------");
		System.out.println(cb1.getTitulaire() + " fait un virement de 20 euros vers " + c1.getTitulaire());
		System.out.println(cb1.virement(20, c1) ? "virement effectué" : refuse);
		System.out.println(c1);
		System.out.println(cb1);
	}
	
	static void testTpComptev1() {
		CompteSimple c1 = new CompteSimple("A");
		CompteSimple c2 = new CompteSimple("B", 500);
		
		String refuse = "Opération refusée";
		
		System.out.println("comptes à la création :");
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("---------------------------");
		System.out.println(c1.getTitulaire() + " est débité de 10 euros");
		System.out.println(c1.debiter(10) ? "compte débité" : refuse);
		System.out.println(c1);
		
		System.out.println("---------------------------");
		System.out.println(c2.getTitulaire() + " est crédité de 50 euros");
		System.out.println(c2.crediter(50) ? "compte crédité" : refuse);
		System.out.println(c2);
		
		System.out.println("---------------------------");
		System.out.println(c2.getTitulaire() + " fait un virement de 20 euros vers " + c1.getTitulaire());
		System.out.println(c2.virement(20, c1) ? "virement effectué" : refuse);
		System.out.println(c1);
		System.out.println(c2);
		
		System.out.println("---------------------------");
		System.out.println("On tente de débiter " + c1.getTitulaire() + " de 30 euros");
		System.out.println(c1.debiter(30) ? "compte débité" : refuse);
		System.out.println(c1);
	}
}
