package projetHeritagev1;

import javax.management.ObjectInstance;

import model.*;

public class Test {

	public static void main(String[] args) {
		test6();
	}
	
	static void test6() {
		X monX = new X();
		monX.x1();
		// monX.x2(); private => pas accessible
		// monX.x3(); protected => pas accessible
		Y monY = new Y();
		monY.y1();
	}
	
	static void test3() {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		a.m();
		b.m();
		c.m();
	}
	
	static void test2() {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		System.out.println("--------A--------");
		a.m1();
		System.out.println("--------B--------");
		b.m1();
		b.m2();
		System.out.println("--------C--------");
		c.m1();
		c.m3();
		System.out.println("--------D--------");
		d.m1();
		d.m2();
		d.m4();
	}
	
	static void test1() {
		A a = new A();
		a.m1();
		
		B b = new B();
		b.m2();
		b.m1();
	}

}
