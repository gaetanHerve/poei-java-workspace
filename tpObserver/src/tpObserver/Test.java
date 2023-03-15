package tpObserver;

public class Test {

	public static void main(String[] args) {
		testObserver();
	}
	
	static void testObserver() {
		Prof p1 = new Prof("jacky");
        
        Eleve e1 = new Eleve("a");
        Eleve e2 = new Eleve("b");
        Eleve e3 = new Eleve("c");
        Eleve e4 = new Eleve("d");
        
        e1.setProf(p1);
        e2.setProf(p1);
        e3.setProf(p1);
        e4.setProf(p1);
        
        p1.abo(e1);
        p1.abo(e2);
//        p1.abo(e3);
        p1.abo(e4);
        
        p1.setNote(18);
        
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);
	}

}
