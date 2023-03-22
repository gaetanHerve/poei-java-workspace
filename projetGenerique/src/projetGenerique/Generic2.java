package projetGenerique;

public class Generic2<T,S> {
	
	private T a;
	private S b;

	public Generic2(T a) {
		this.a = a;
	}
	
	public Generic2(T a, S b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}
	
	public void setA(T a) {
		this.a = a;
	}
	
}
