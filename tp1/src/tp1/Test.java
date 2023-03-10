package tp1;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tpCalcul();
	}
	
	
	///// TP CALCUL /////
	
	static void tpCalcul() {		
		Scanner clavierDbl = new Scanner(System.in);
		Scanner clavierStr = new Scanner(System.in);
		
		System.out.println("veuillez saisir le 1er opérande : ");
		double a = clavierDbl.nextDouble();
		System.out.println("veuillez saisir le 2nd opérande : ");
		double b = clavierDbl.nextDouble();
		System.out.println("veuillez saisir l'opérateur (+, -, *, /) : ");
		String operator = clavierStr.nextLine();
		
		System.out.println(calcul(a, b, operator));
		
		clavierStr.close();
		clavierDbl.close();
	}
	
	static double calcul(double a, double b, String operator) {
		double result = 0.0;
		switch(operator) {
			case "+":
				result = add(a, b);
				break;
			case "-":
				result = remove(a, b);
				break;
			case "*":
				result = mult(a, b);
				break;
			case "/":
				result = divide(a, b);
				break;
			default:
				System.out.println("l'opérateur sélectionné n'est pas valide");
				break;
		}
		return result;
	}
	
	static double add(double a, double b) {
		return a + b;
	}
	
	static double remove(double a, double b) {
		return a - b;
	}
	
	static double mult(double a, double b) {
		return a * b;
	}
	
	static double divide(double a, double b) {
		double result = 0.0;
		if (b != 0) {
			result = a / b;
		} else {
			System.out.println("le 2nd operande doit être différent de zéro dans le cas d'une division");
		}
		return result;
	}
	
	///// FIN TP CALCUL /////
	
	static void tpPowerv2() {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("veuillez saisir le nombre : ");
		int nb = clavier.nextInt();
		System.out.println("veuillez saisir la puissance: ");
		int pow = clavier.nextInt();
		
		System.out.println("result: " + power2(nb, pow));
		
		clavier.close();
	}
	
	static int power2(int nb, int pow) {
		int i = 0;
		int result = nb;
		while (i < pow-1) {
			result *= nb;
			i++;
		}
		return result;
	}
	
	static void tpRandomv1() {
		Random r = new Random();
		Scanner clavier = new Scanner(System.in);
		int nb = r.nextInt(10);
		int userResponse = -1;
		int count = 0;
		System.out.println("nb � trouver : " + nb);
		
		do {
			System.out.println("veuillez saisir un nombre entre 0 et 10 : ");
			userResponse = clavier.nextInt();
			count++;
		} while ((userResponse != nb));
		
		System.out.println("Bravo, vous avez trouv� la r�ponse en " + count + " tentatives");
		clavier.close();
	}
	
	static void tpRandomAdvanced() {
		Random r = new Random();
		Scanner clavier = new Scanner(System.in);
		int nb = r.nextInt(10);
		int userResponse = -1;
		int count = 0;
		System.out.println("nb � trouver : " + nb);
		
		do {
			System.out.println("veuillez saisir un nombre entre 0 et 10 : ");
			userResponse = clavier.nextInt();
			count++;
		} while (userResponse != nb && count < 5);
		
		String toPrint = count < 5
				? "Bravo, vous avez trouv� la r�ponse en " + count + " tentatives"
				: "GAME OVER";
		System.out.println(toPrint);
		clavier.close();
	}
	
	static void tpPower() {
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("veuillez saisir le nombre : ");
		int nb = clavier.nextInt();
		System.out.println("veuillez saisir la puissance: ");
		int pow = clavier.nextInt();
		
		int i = 0;
		int result = nb;
		while (i < pow-1) {
			result *= nb;
			i++;
		}
		System.out.println("result: " + result);
		
		clavier.close();
	}
	
	static void tpBoucle() {
		Scanner clavierInt = new Scanner(System.in);
		Scanner clavierString = new Scanner(System.in);
		
		System.out.println("donner un caract�re : ");
		String caractere = clavierString.nextLine();
		System.out.println("hauteur ?");
		int height = clavierInt.nextInt();
		System.out.println("largeur ?");
		int width = clavierInt.nextInt();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				String toPrint = caractere + "\t";
				if (j == width-1)
					toPrint += "\n";
				System.out.print(toPrint);
			}
		}
		
		clavierInt.close();
		clavierString.close();
	}
	
	static void tpBouclev2() {
		String result = "";
		
		Scanner clavierInt = new Scanner(System.in);
		Scanner clavierString = new Scanner(System.in);
		
		System.out.println("donner un caract�re : ");
		String caractere = clavierString.nextLine();
		System.out.println("hauteur ?");
		int height = clavierInt.nextInt();
		System.out.println("largeur ?");
		int width = clavierInt.nextInt();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				String toPrint = caractere + "\t";
				if (j == width-1)
					toPrint += "\n";
				result += toPrint;
			}
			System.out.println(result);
		}
		clavierInt.close();
		clavierString.close();
	}
		
	static void tpBouclev3() {
		StringBuilder sb = new StringBuilder();
		
		Scanner clavierInt = new Scanner(System.in);
		Scanner clavierString = new Scanner(System.in);
		
		System.out.println("donner un caract�re : ");
		String caractere = clavierString.nextLine();
		System.out.println("hauteur ?");
		int height = clavierInt.nextInt();
		System.out.println("largeur ?");
		int width = clavierInt.nextInt();
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				sb.append(caractere + "\t");
				if (j == width-1) sb.append("\n");
			}
		}
		
		System.out.println(sb);
		
		clavierInt.close();
		clavierString.close();
	}
	
	static void tpBoucleAlternative() {
		String result = "";
		
		Scanner clavierInt = new Scanner(System.in);
		Scanner clavierString = new Scanner(System.in);
		
		System.out.println("donner un caract�re : ");
		String caractere = clavierString.nextLine();
		System.out.println("hauteur ?");
		int height = clavierInt.nextInt();
		System.out.println("largeur ?");
		int width = clavierInt.nextInt();
	
		for (int i = 1; i <= height*width; i++) {
			String toPrint = caractere + "\t";
			if (i%width == 0) {
				toPrint += "\n";
			}
			result += toPrint;
		}
		
		System.out.print(result);
		
		clavierInt.close();
		clavierString.close();
	}
	
	static void tpMenu() {
		String baseStr = "- pour lancer la m�thode ";
		String[] methodNames = {"tpInfos", "tpAge", "tpMaxTernaire"};
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("MENU");
		for (int i=0; i < methodNames.length; i++) {
			System.out.println(baseStr + methodNames[i] + ", tapez " + (i + 1));
		}
		
		int choice = clavier.nextInt();
		
		switch(choice) {
		case 1:
			tpInfos();
			break;
		case 2:
			tpAge();
			break;
		case 3:
			tpMaxTernaire();
			break;
		default:
			System.out.println("unknown method, try again");
			tpMenu();
			break;
		}
		
		clavier.close();
	}
	
	static void tpMaxTernaire() {
		Scanner clavier = new Scanner(System.in);
		System.out.println("a?");
		int a = clavier.nextInt();
		System.out.println("b?");
		int b = clavier.nextInt();
		System.out.println("c?");
		int c = clavier.nextInt();
		
		String maxValue = (a > b && a > c) ? "a" : (b > c) ? "b" : "c";  
		
		System.out.println("valeur max : " + maxValue);
		clavier.close();
	}
	
	static void tpAge() {
		
		String status;
		Scanner clavierStr = new Scanner(System.in);
		Scanner clavierInt = new Scanner(System.in);
		
		System.out.println("nom ?");
		String nom = clavierStr.nextLine();
		
		System.out.println("age ?");
		int age = clavierInt.nextInt();
		
		if (age > 0 && age <= 120) {
			if (age < 18) {
				status = "mineur";
			} else if (age < 50) {
				status = "majeur";
			} else {
				status = "senior";
			}
		} else {
			status = "erreur";
		}
		
		String result = nom + ", " + age + " ans, " + "status " + status;
		
		System.out.println(result);
		clavierInt.close();
		clavierStr.close();
	}
	
	static void tpInfos() {
		// nom, pr�nom, agen taille (metres), poids (kilos)
		// afficher r�cap
		
		String result = "";
		Scanner clavierStr = new Scanner(System.in);
		Scanner clavierInt = new Scanner(System.in);
		Scanner clavierDouble = new Scanner(System.in);
		
		System.out.println("nom ?");
		String nom = clavierStr.nextLine();
		result += "NOM: " + nom + " ";
		
		System.out.println("pr�nom ?");
		String prenom = clavierStr.nextLine();
		result += "PRENOM: " + prenom + " ";
		
		System.out.println("age ?");
		int age = clavierInt.nextInt();
		result += "AGE: " + age+ "ans ";
		
		System.out.println("taille en m�tres ?");
		double taille = clavierDouble.nextDouble();
		result += "TAILLE: " + taille + "m ";
		
		System.out.println("poids en kilos ?");
		double poids = clavierDouble.nextDouble();
		result += "POIDS: " + poids +"kg";
		
		System.out.println(result);
		
		clavierDouble.close();
		clavierInt.close();
		clavierStr.close();
	}

}
