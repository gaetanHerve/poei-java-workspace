package projetSingleton;

public class Test {

	public static void main(String[] args) {
		test1();
	}
	
	static void test1() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}

}
