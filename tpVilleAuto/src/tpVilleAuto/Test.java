package tpVilleAuto;

public class Test {

	public static void main(String[] args) {
		test1();
	}
	
	public static void test1() {
		Ville v = new Ville("Paris", "France", 5.0);
		System.out.println(v);
		v.setNbHabitant(4.4);
		System.out.println(v);
		System.out.println(v.getNom());
	}

}
