package tpVilleAuto;

public class Test {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		Ville v1 = new Ville("Paris", "France", "Paris", 5.2);
		System.out.println(v1);
		
		Ville v2 = new Ville("Rennes", "France", "Paris", 0.222);
		System.out.println(v2);
		
		v2.setNbHabitant(-2.0);
		System.out.println(v2);
	}

}
