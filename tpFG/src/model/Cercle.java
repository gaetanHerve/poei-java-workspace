package model;

public class Cercle extends FG {
	private double rayon;
	
	public Cercle(double rayon) {
		this.rayon = rayon;
	}

	@Override
	public double calculAire() {
		return Math.PI * rayon*rayon;
	}

	@Override
	public double calculPerim() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public String toString() {
		return super.toString() + " rayon = " + rayon  + "]";
	}

}
