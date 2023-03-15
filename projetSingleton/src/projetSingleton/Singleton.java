package projetSingleton;

public class Singleton {
	private static Singleton instance;
	private String[] tab = {"bonjour", "toto", "à bientôt"};
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public String toString() {
		String result = "";
		for (String s : tab) {
			result += s + "\t";
		}
		return result;
	}
}
