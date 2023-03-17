package projetCoordonnees;

public class DeuxD {
	
	private int x;
	private int y;

	public DeuxD(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " x: " + x + ", y: " + y;
	}
	
}
