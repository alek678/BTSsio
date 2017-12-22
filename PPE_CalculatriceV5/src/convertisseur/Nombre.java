package convertisseur;
import java.util.ArrayList;

public class Nombre {
	
	//--------Constante space utilisée pour l'affichage en AsciiArt-------------------
	private static final String SPACE = "  ";
	
	public ArrayList<Chiffre> liste = new ArrayList<>();
	private Base baseN;
	
	//--------Constructeur------------------------------------------------------------
	public Nombre(String valeur, Base baseN) {
		super();
		this.liste = listing(valeur);
		this.baseN = baseN;
	}
	
	//-------On prend chaque caractère du nombre et on crée des instance de Chiffre qu'on range dans une ArrayList
	private ArrayList<Chiffre> listing(String value){		
		for (int i=0; i<value.length();i++) {
			Chiffre c = new Chiffre(value.charAt(i));
			liste.add(c);
		}
		
		return liste;
	}
	
	//-------Fonction de conversion d'un nombre en base N vers base 10----------------
	public int convertToDecimal(){
		int rep = composition().indexOf(this.liste.get(0).getValeur());
		for (int i = 0; i < (liste.size()-1); i++) {
			rep = rep*this.baseN.getTaille() + composition().indexOf(this.liste.get(i+1).getValeur());
		}
		return rep;
	}
	
	//-------Fonction de conversion d'un nombre en base 10 vers base de Sortie-------
	public static String convertTo(int nombreBase10, Base baseSortie) {
		String rep = "";
		ArrayList<Character> tabRep = new ArrayList<Character>();
		int r = nombreBase10;
		do {
			tabRep.add((char) (r%baseSortie.getTaille()));
			r /= baseSortie.getTaille();
		}while(r != 0);
		
		for (int i=tabRep.size()-1; i>=0; i--) {
			rep += baseSortie.getComposition().get(tabRep.get(i));
		}
		return rep;
	}
	
	//-------Fonction pour afficher le nombre en AsciiArt----------------------------
	public void asciiArt() {
		//tableau de 5 lignes
		for (int j = 0; j<5; j++) {
			for (Chiffre chiffre : this.liste) {
				//tableau de 5 colonnes
				for (int k=0; k<5; k++) {
					System.out.print(chiffre.getRepresentation()[j*5+k]);
				}
				System.out.print(SPACE);
			}
			System.out.println("");
		}
	}

	private ArrayList<Character> composition(){
		return this.baseN.getComposition();
	}
}
