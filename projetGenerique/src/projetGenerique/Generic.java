package projetGenerique;

public class Generic<E> {
	
	private E a;

	public Generic(E a) {
		this.a = a;
	}

	public E getA() {
		return a;
	}
	
	public void setA(E a) {
		this.a = a;
	}
	
}
