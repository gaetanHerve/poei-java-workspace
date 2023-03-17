package projetHeritagev2;

public class Test {

	public static void main(String[] args) {
		test8();
	}
	
	static void test9() {
		A a  = new A();
		A b  = new B();
		A c  = new C();
	}
	
	static void test8() {
		B v1 = new B();
	
		if (v1 instanceof A) {
			System.out.println("B est une instance de A");
		} else {
			System.out.println("B est une instance de B");
		}
		
	}
	
	static void test7() {
		D v1 = new D();
		v1.m4();
		Object v2 = v1;
		System.out.println(v2);
		if (v2 instanceof A) {
			A v3 = (A)v2;
		}
		
	}
	
	static void test6() {
		A[] tab = {new A(), new B(), new C()};
		for (A a : tab) {
			a.m();
		}
	}
	
	static void test5() {
		A a = new A();
		B b = new B();
		C c = new C();
		
		A[] tab = {a, b, c};
		for (A monA : tab) {
			monA.m();
		}
	}
	
	static void test4() {
		B b1  = new B();
		
		
		A b2  = b1;
		b2.m();
		
		// cast implicite
		A b3  = b2;
		b3.m();
		
		// cast explicite
		B b4 = (B)b3;
		b4.m2();
		
		
		
	}
	
	static void test3() {
		A a  = new A();
		A b  = new B();
		A c  = new C();
		
		A[] tab = {a, b, c};
		for (A monA : tab) {
			monA.m();
		}
	}
	
	static void test2() {
		B b1 = new B();
		b1.m();
		
		A b2 = new B();
		b2.m();
		// b2.m2(); ne fonctionne pas : de type A
	}
	
	static void test1() {
		A a = new A();
		a.m();
		
		B b = new B();
		b.m();
		
		C c = new C();
		c.m();
	}

}
