package projetInterface;

public class Test {
	public static void main(String[] args) {
		test4();
	}

	static void test4() {
		A a = new A();
		B b = new B();
		// C c = new C();
		testI1(a);
		testI1(b);
		// testI1(c);
	}

	static void testI1(I1 i1) {
		i1.m1();
	}

	static void test3() {
		I1[] tab = { new A(), new B() };

		for (I1 i1 : tab) {
			i1.m1();
		}
	}

	static void test2() {
		B monB = new B();
		monB.mB();
		monB.m1();
		monB.m2();
		monB.m3();

		I1 monB2 = monB;
		monB2.m1();

		B b3 = (B) monB2;
		b3.m3();

	}

	static void test1() {
		A monA = new A();
		monA.mA();
		monA.m1();
		monA.m2();
	}
}
