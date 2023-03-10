package projetTableau;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		tpSimulateurCredit();
		// tpSort();
	}
	
	
	///// TP SORT /////
	
	static void tpSort() {
		Scanner clavier = new Scanner(System.in);
		int[] tab = getTab(clavier);
		
		System.out.println("Tableau initial:");
		affiche(tab);
		
		int sortMethod = getSortMethod(clavier);
		
		switch (sortMethod) {
			case 1:
				bubbleSort(tab);
				break;
			case 2:
				bubbleSortOptimized(tab);
				break;
			default:
				bubbleSort(tab);
		}
		
		System.out.println("Tableau trié:");
		affiche(tab);
		
		clavier.close();
	}
	
	static int getSortMethod(Scanner clavier) {
		System.out.println("Méthode de tri:");
		System.out.println("1- tri à bulles\n2- tri à bulles optimisé");
		int sortMethod = clavier.nextInt();
		return sortMethod;
	}
	
	static void bubbleSortOptimized(int[] tab) {
		boolean sorted;
		for (int i = tab.length-1; i > 0; i--) {
			sorted = true;
			for (int j = 0; j < i; j++) {
				if (tab[j+1] < tab[j]) {
					int next = tab[j+1];
					tab[j+1] = tab[j];
					tab[j] = next;
					sorted = false;
				}
			}
			if (sorted) break;
		}
	}
	
	static void bubbleSort(int[] tab) {
		for (int i = tab.length-1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (tab[j+1] < tab[j]) {
					int next = tab[j+1];
					tab[j+1] = tab[j];
					tab[j] = next;
				}
			}
		}
	}
	
	static int[] getTab(Scanner clavier) {
		System.out.println("Taille du tableau:");
		int taille = clavier.nextInt();
		int[] tab = new int[taille];
		
		for (int i = 0; i < taille; i++) {
			System.out.println("Elément " + (i+1) + ":");
			tab[i] = clavier.nextInt();
		}
		return tab;
	}
	
	static void affiche(int[] tab) {
		for(int e : tab) {
			System.out.print(e + "\t");
		}
		System.out.print("\n");
	}
	
	///// FIN TP SORT /////
	
	
	///// TP SIMULATEUR CREDIT /////
	
	static void tpSimulateurCredit() {
		String baseRegle = "18-30-15;31-50-20;51-70-10";
		int nbParams = 3;
		int[][] regles = getRegles(baseRegle, nbParams);
		
		Scanner clavierStr = new Scanner(System.in);
		Scanner clavierInt = new Scanner(System.in);
		
		String nom = getUserName(clavierStr);
		int[] situation = getUserSituation(clavierInt);
		int age = situation[0];
		int salaireMensuelBrut = situation[1];
		int montant = situation[2];
		double taux = getTaux(age, regles);
		
		if (peutEmprunter(taux, salaireMensuelBrut, montant)) {
			printEmprunt(montant);
		} else {
			System.out.println("Nous sommes navrés " + nom.toUpperCase() + ", mais votre situation ne vous permet pas de contracter un emprunt");
		}
		
		clavierStr.close();
		clavierInt.close();
	}
	
	static String getUserName(Scanner clavier) {
		System.out.println("Nom :");
		return clavier.nextLine();
	}
	
	static int[] getUserSituation(Scanner clavier) {
		System.out.println("Age:");
		int age = clavier.nextInt();
		
		System.out.println("Salaire mensuel brut :");
		int salaireMensuelBrut = clavier.nextInt();
		
		System.out.println("Montant de l'emprunt souhaité :");
		int montant = clavier.nextInt();
		
		return new int[] {age, salaireMensuelBrut, montant};
	}
	
	static void printEmprunt(int montant) {
		System.out.println("emprunt OK");
		System.out.printf("Montant emprunté : %.2f \n", (double) montant);
		System.out.printf("Somme à rembourser : %.2f \n", getRemboursementTotal(montant));
		System.out.printf("Remboursement mensuel : %.2f \n", getRemboursementMensuel(montant));
	}
	
	static boolean peutEmprunter(double taux, int salaireMensuelBrut, int montant) {
		return (taux != -1) && checkSalaire(taux, salaireMensuelBrut, montant);
	}
	
	static double getRemboursementTotal(int montant) {
		return montant * 1.03;
	}
	
	static double getRemboursementMensuel(int montant) {
		return getRemboursementTotal(montant) / 12;
	}
	
	static boolean checkSalaire(double taux, int salaireMensuelBrut, int montant) {
		double salaireAnnuelNet = (double) salaireMensuelBrut * 0.77 * 12;
		return montant < (taux * salaireAnnuelNet);
	}
	
	static double getTaux(int age, int[][] regles) {
		double result = -1;
		for (int[] regle : regles) {
			if (age >= regle[0] && age <= regle[1]) {
				result = (double)regle[2]/100;
			}
		}
		return result;
	}
	
	static int[][] getRegles(String baseRegle, int nbParams) {
		String[] tmpRegles = baseRegle.split(";");
		int[][] regles = new int[tmpRegles.length][nbParams];
		
		for (int i = 0; i < tmpRegles.length; i++) {
			String[] regleElems = tmpRegles[i].split("-");
			for (int j = 0; j < nbParams; j++) {
				regles[i][j] = Integer.parseInt(regleElems[j]);
			}
		}
		return regles;
	}
	
	///// FIN TP SIMULATEUR CREDIT /////
	
	static void tpTraitementTexte() {
		Scanner clavier = new Scanner(System.in);
		String result;
		
		System.out.println("veuillez écrire une phrase");
		String phrase = clavier.nextLine();
		
		result = traitementTexte(phrase);
		
		System.out.println(result);
		clavier.close();
	}
	
	static String traitementTexte(String str) {
		String[] strTab = str.split(" ");
		reverseString(strTab);
		return concatString(strTab);
	}
	
	static String concatString(String[] strTab) {
		String result = "";
		for (String e : strTab) {
			result += e.toUpperCase();
			result += " ";
		}
		return result;
	}
	
	static void reverseString(String[] tab) {
		for (int i = 0; i < tab.length / 2; i++) {
			String tmp = tab[i];
			tab[i] = tab[tab.length-(i+1)];
			tab[tab.length-(i+1)] = tmp;
		}
	}
	
	
	static void testSplit() {
		String str = "aa;bb;cc;dd eee   f; f";
		String[] tab = str.split(";");
		affiche(tab);
	}
	
	static void tpReversev2() {
		int[] tab = {10, 20, 30, 40, 50};
		affiche(tab);
		// reverseGPT(tab);
		reversev2(tab);
		System.out.println();
		affiche(tab);
	}
	
	static void reverseGPT(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			array[i] = array[i] + array[array.length - i - 1];
			array[array.length - i - 1] = array[i] - array[array.length - i - 1];
			array[i] = array[i] - array[array.length - i - 1];
		}
	}
	
	static void reversev2(int[] tab) {
		for (int i = 0; i < tab.length / 2; i++) {
			int tmp = tab[i];
			tab[i] = tab[tab.length-(i+1)];
			tab[tab.length-(i+1)] = tmp;
		}
	}
	
	static void tpReverse() {
		String[] strTab = {"aa", "bb", "cc"};
		
		System.out.println("Tableau initial: ");
		for (String e : strTab) {
			System.out.print(e + "\t");
		}
		System.out.println();
		
		String[] reversedTab = reverse(strTab);
		System.out.println("Tableau inversé: ");
		
		for (String e : reversedTab) {
			System.out.print(e + "\t");
		}
		
	}
	
	static String[] reverse(String[] tab) {
		int length = tab.length;
		
		String[] result = new String[length];
		
		for (int i = 0; i < length; i++) {
			result[i] = tab[length-(i+1)];
		}
		return result;
	}
	
	static void testDoublerTableau() {
		int[] tab1 = {10, 20, 30};
		int[] tab2 = doublerTableau(tab1);
		affiche(tab1);
		System.out.println();
		affiche(tab2);
	}
	
	static int[] doublerTableau(int[] tab) {
		int[] result = new int[tab.length];
		for (int i = 0; i < tab.length; i++) {
			result[i] = tab[i] * 2;
		}
		return result;
	}
	
	static void testDoublerTableauSurReference() {
		int[] tab1 = {10, 20, 30};
		System.out.println("tab1: " + tab1);
		int[] tab2 = {10, 20, 30};
		System.out.println("tab2: " + tab2);
		affiche(tab1);
		System.out.println();
		doublerTableauSurReference(tab1);
		affiche(tab1);
	}
	
	static void doublerTableauSurReference(int[] tab) {
		System.out.println("tab:" + tab);
		for (int i = 0; i < tab.length; i++) {
			tab[i] = tab[i] * 2;
		}
	}
	
	static void testReturnTableau() {
		int[] tab = returnTableau();
		affiche(tab);
	}
	
	static int[] returnTableau() {
		int[] tab = {1, 2, 3};
		return tab;
	}
	
	static void tpOccurrence() {
		int[] tab = {10, 2, 30, 10, 1, 2, 5, 10};
		Scanner clavier = new Scanner(System.in);
		System.out.println("Veuillez saisir un nombre de la liste suivante : ");
		for (int e : tab) {
			System.out.print(e + "\t");
		}
		System.out.println();
		
		int saisie = clavier.nextInt();
		int nbOccurrences = occurrence(tab, saisie);
		
		System.out.println("ce nombre apparaît " + nbOccurrences + " fois dans la liste");
		clavier .close();
	}
	
	static int occurrence(int[] tab, int saisie) {
		int result = 0;
		
		for (int e : tab) {
			if (e == saisie) {
				result += 1;
			}
		}
		return result;
	}
	
	static void testAfficheInt() {
		int[] tab1 = {10, 20, 30};
		int[] tab2 = {1, 2, 3};
		int[] tab3 = {4, 5, 6};
		
		affiche(tab1);
		affiche(tab2);
		affiche(tab3);
	}
	
	static void testAfficheStr() {
		String[] tab1 = {"aa", "bb", "cc"};
		String[] tab2 = {"dd", "ee", "ff"};
		String[] tab3 = {"xx", "yy", "zz"};
		
		affiche(tab1);
		affiche(tab2);
		affiche(tab3);
	}
	
	static void affiche(String[] tab) {
		for(String e : tab) {
			if (e != null) {
				System.out.print(e + "\t");
			}
		}
		System.out.print("\n");
	}
	
	static void testTableauStringv2() {
		String[] tab = new String[4];
		
		tab[0] = "aa";
		tab[1] = "bb";
		tab[2] = "cc";
		
		for(String e : tab) {
			System.out.print(e + "\t");
		}
		
		for(String e : tab) {
			if (e != null) {
				System.out.print(e.toUpperCase() + "\t");
			}
		}
	}
	
	static void testTableauStringv1() {
		String[] tab = {"aa", "bb", "cc"};
		
		for(String e : tab) {
			System.out.print(e + "\t");
		}
	}
	
	static void testTableauIntv2() {
		int[] tab = {10, 20, 30};
		
		for(int e: tab) {
			System.out.print(e + "\t");
		}
	}
	
	static void tpTableauv1() {
		Scanner clavierInt = new Scanner(System.in);
		Scanner clavierStr = new Scanner(System.in);
		
		System.out.println("taille du tableau ? ");
		int size = clavierInt.nextInt();
		String[] arr = new String[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Veuillez saisir un chaîne pour l'entrée n°" + (i+1) + ": ");
			arr[i] = clavierStr.nextLine();
		}
		
		System.out.println("Voici le contenu du tableau: ");
		for (int i = 0; i < size; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		clavierInt.close();
		clavierStr.close();
	}
	
	static void testTableauIntv1() {
		int[] tab = new int[3];
		
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new Random().nextInt(10);
		}
		
		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + "\t");
		}
	}

}