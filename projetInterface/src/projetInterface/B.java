package projetInterface;

public class B implements I3 {

	public void mB() {
		System.out.println("Je suis mB de B");
	}
	
	@Override
	public void m1() {
		System.out.println("Je suis m1 de B");
	}

	@Override
	public void m2() {
		System.out.println("Je suis m2 de B");
	}

	@Override
	public void m3() {
		System.out.println("Je suis m3 de B");
	}
	
}
