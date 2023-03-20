package projetInterface;

public class A extends X implements I1, I2 {

	public void mA() {
		System.out.println("Je suis mA de A");
	}

	@Override
	public void m1() {
		System.out.println("Je suis m1 de A");
	}

	@Override
	public void m2() {
		System.out.println("Je suis m2 de A");
	}

}
