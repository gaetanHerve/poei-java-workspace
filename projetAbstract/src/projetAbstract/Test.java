package projetAbstract;

public class Test {
	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		B monB = new B();
		// monA.m1();
		
		A.m2();
		monB.m();
		monB.m1();
		
		C monC = new C();
		monC.m();
		monC.m4();
	}
}
