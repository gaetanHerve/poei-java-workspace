package projetHeritagev1;

public class C extends A {
	
	public void m3() {
		System.out.println("je suis m3 de C");
	}
	
	// final => ne peut pas être redéfinie dans les enfants
		@Override
		final public void m() {
			super.m();
			System.out.println("...mais je suis dans C");
		}
	
}
