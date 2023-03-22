package tpGeneric;

public class Generic<T> {
	
	private T[] tab;
	
	@SuppressWarnings("unchecked")
	public Generic(int taille) {
		this.tab = (T[]) new Object[taille];
	}
	
	public void add(T elem) {
		for (int i = 0; i < this.tab.length; i++) {
			if(this.tab[i] == null) {
				this.tab[i] = elem;
				break;
			}
		}
	}
	
	public T getElem(int index) {
		return this.tab[index];
	}

	@Override
	public String toString() {
		String result = "";
		for (int i = 0; i < this.tab.length; i++) {
			result += this.tab[i] + "\n";
		}
		return result;
	}

}
