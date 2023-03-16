package projetHeritagev1;

public class B extends A {
	
	public void m2() {
		System.out.println("je suis m2 de B");
	}
	
	// final => ne peut pas être redéfinie dans les enfants
	@Override
	final public void m() {
		System.out.println("je suis m de B");
	}
	
	public String toString() {
		return  this.getClass().getSimpleName() + " c'est la toString de B";
	}
	
}
