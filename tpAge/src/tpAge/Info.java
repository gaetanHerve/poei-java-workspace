package tpAge;

public class Info {
	
	static String getInfos(int age, String nom) {
		String status;
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
		
		return nom + ", " + age + " ans, " + "status " + status;
	}

}
