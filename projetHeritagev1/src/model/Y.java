package model;

public class Y extends X {
	
	public void y1() {
		System.out.println("Je suis y1 de Y");
		x1();
		// x2(); private => pas accessible
		x3(); // protected => pas accessible
	}
	
	private void y2() {
		System.out.println("Je suis y2 de Y");
	}
	
	protected void y3() {
		System.out.println("Je suis y3 de Y");
	}

}