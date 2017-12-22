package convertisseur;

public class Chiffre {
	
	//--------tableaux de 25 char représentant chaque chiffre dans un cadre 5x5--------
	private static final char[] representation0 = {' ','0','0','0',' ','0',' ',' ','0','0','0',' ','0',' ','0','0','0',' ',' ','0',' ','0','0','0',' '};
	private static final char[] representation1 = {' ',' ','1',' ',' ',' ','1','1',' ',' ',' ',' ','1',' ',' ',' ',' ','1',' ',' ',' ','1','1','1',' '};
	private static final char[] representation2 = {' ','2','2','2',' ','2',' ',' ',' ','2',' ',' ',' ','2',' ',' ',' ','2',' ',' ','2','2','2','2','2'};
	private static final char[] representation3 = {'3','3','3','3',' ',' ',' ',' ',' ','3',' ',' ','3','3',' ',' ',' ',' ',' ','3','3','3','3','3',' '};
	private static final char[] representation4 = {' ',' ','4','4',' ',' ','4',' ','4',' ','4','4','4','4','4',' ',' ',' ','4',' ',' ',' ',' ','4',' '};
	private static final char[] representation5 = {'5','5','5','5',' ','5',' ',' ',' ',' ','5','5','5','5',' ',' ',' ',' ',' ','5','5','5','5','5',' '};
	private static final char[] representation6 = {' ','6','6','6',' ','6',' ',' ',' ',' ','6','6','6','6',' ','6',' ',' ',' ','6',' ','6','6','6',' '};
	private static final char[] representation7 = {'7','7','7','7','7',' ',' ',' ',' ','7',' ',' ',' ','7',' ',' ',' ','7',' ',' ',' ','7',' ',' ',' ',' '};
	private static final char[] representation8 = {' ','8','8','8',' ','8',' ',' ',' ','8',' ','8','8','8',' ','8',' ',' ',' ','8',' ','8','8','8',' '};
	private static final char[] representation9 = {' ','9','9','9',' ','9',' ',' ',' ','9',' ','9','9','9','9',' ',' ',' ',' ','9',' ','9','9','9',' '};
	private static final char[] representationA = {' ','A','A','A',' ','A',' ',' ',' ','A','A','A','A','A','A','A',' ',' ',' ','A','A',' ',' ',' ','A'};
	private static final char[] representationB = {'B','B','B','B',' ','B',' ',' ',' ','B','B','B','B','B',' ','B',' ',' ',' ','B','B','B','B','B','B',' '};
	private static final char[] representationC = {' ','C','C','C','C','C',' ',' ',' ',' ','C',' ',' ',' ',' ','C',' ',' ',' ',' ',' ','C','C','C','C'};
	private static final char[] representationD = {'D','D','D','D',' ',' ','D',' ',' ','D',' ','D',' ',' ','D',' ','D',' ',' ','D','D','D','D','D',' '};
	private static final char[] representationE = {'E','E','E','E','E','E',' ',' ',' ',' ','E','E','E',' ',' ','E',' ',' ',' ',' ','E','E','E','E','E'};
	private static final char[] representationF = {'F','F','F','F','F','F',' ',' ',' ',' ','F','F','F',' ',' ','F',' ',' ',' ',' ','F',' ',' ',' ',' '};
	
	//-------------Initialisation des attributs----------------------
	private char valeur=' ';
	private char[] representation;
	
	//----------------------------------------------------CONSTRUCTEUR-----------------------------------------------------
	public Chiffre(char valeur) {
		super();
		this.valeur = valeur;
		
		switch (valeur) {
		case '0':
			this.representation = representation0;
			break;
		case '1':
			this.representation = representation1;
			break;
		case '2':
			this.representation = representation2;
			break;
		case '3':
			this.representation = representation3;
			break;
		case '4':
			this.representation = representation4;
			break;
		case '5':
			this.representation = representation5;
			break;
		case '6':
			this.representation = representation6;
			break;
		case '7':
			this.representation = representation7;
			break;
		case '8':
			this.representation = representation8;
			break;
		case '9':
			this.representation = representation9;
			break;
		case 'A':
			this.representation = representationA;
			break;
		case 'B':
			this.representation = representationB;
			break;
		case 'C':
			this.representation = representationC;
			break;
		case 'D':
			this.representation = representationD;
			break;
		case 'E':
			this.representation = representationE;
			break;
		case 'F':
			this.representation = representationF;
			break;
		default:
			break;
		}
	}
	
	//----------------------------------------------------GETERS & SETTERS-----------------------------------------------------
	public char[] getRepresentation() {
		return this.representation;
	}

	public char getValeur() {
		return this.valeur;
	}
}
