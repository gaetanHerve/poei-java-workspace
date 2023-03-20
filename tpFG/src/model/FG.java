package model;

/**
 * @author gherve
 *
 */
public abstract class FG {
	public abstract double calculAire();
	public abstract double calculPerim();
	
	@Override
		public String toString() {
			return "Aire: " + calculAire() + ", périmètre: " + calculPerim();
		}
}
