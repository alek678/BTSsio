package convertisseur;

public class Racines {
	
	public static void calculRacines(double a, double b, double c) {
		// Calcul du discriminant delta :
		double delta = (b * b) - (4 * a * c);
		// On calcule les racines selon delta :
		if (delta == 0) {
			double racine = -(b / 2 * a);
			System.out.println(
					"Il est admis une racine à l'équation " + a + "x² + " + b + "x + c : \nRacine = " + racine);
		} else if (delta > 0) {
			double racine1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
			double racine2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
			System.out.println("Il est admis deux racines à l'équation " + a + "x² + " + b + "x + "+c+" : \nRacine1 = "
					+ racine1 + "\nRacine2 = " + racine2);
		} else {
			System.out.println("L'équation n'admet pas de solution réelle.");
		}
	}

}
