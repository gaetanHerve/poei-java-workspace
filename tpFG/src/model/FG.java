package model;


public abstract class FG {
	public abstract double calculAire();
	public abstract double calculPerim();
	
	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [Aire: " + calculAire() + ", périmètre: " + calculPerim();
	}
}
