package projetCoordonnees;

public class Test {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		DeuxD d = new DeuxD(10, 20);
		System.out.println(d);
		
		TroisD t = new TroisD(10, 20, 30);
		System.out.println(t);
	}

}
