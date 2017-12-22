package convertisseur;
import java.util.ArrayList;

public class Base {

	// --------Constante pour le constructeur de base pour la conversion---------------
	private static final char[] BASE10 = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	private static final char[] MAJUSCULES = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',
			'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	private static final char[] MINUSCULES = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
			'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

	private int taille = 0;
	private ArrayList<Character> composition = new ArrayList<Character>();

	public Base(int taille) {
		super();
		this.taille = taille;
		this.composition = creerBase(taille);
	}

	private ArrayList<Character> creerBase(int taille) {
		if (taille < 63) {
			int j = 0, k = 0;
			for (int i = 0; i < taille; i++) {
				if (i < 10) {
					composition.add(BASE10[i]);
				} else if (i >= 10 && i < 36) {
					composition.add(MAJUSCULES[j]);
					j++;
				} else if (i >= 36 && i < 63) {
					composition.add(MINUSCULES[k]);
					k++;
				}
			}
		}

		return composition;
	}

	// ----------------------------------------------------GETERS & SETTERS-----------------------------------------------------

	public int getTaille() {
		return taille;
	}

	public ArrayList<Character> getComposition() {
		return this.composition;
	}

}
