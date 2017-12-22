package controleur;

import java.util.ArrayList;
import ihm.Menu;

import convertisseur.*;

public class Controleur {

	// ---Constantes Menu principal---
	private static final int MENU_PRINCIPAL = 1;
	private static final int CONVERTIR_BASE_DEUX = 2;
	private static final int CONVERTIR_BASE_DIX = 10;
	private static final int CONVERTIR_BASE_AUTRE = 62;
	private static final int AFFICHER_ASCII = 42;
	private static final int RACINES = 3;

	// ---Autre constante---
	private static final int BASE_MAX_ASCII_ART = 16;

	//---Enchainement Menu---
	private int getChoix(int menuAAfficher) {
		int rep;
		switch (menuAAfficher) {
		case MENU_PRINCIPAL:
			ArrayList<String> leMenu = new ArrayList<String>();
			leMenu.add("Convertir en Base 2");
			leMenu.add("Convertir en Base 10");
			leMenu.add("Convertir vers autre Base");
			leMenu.add("Afficher un nombre en Ascii Art");
			leMenu.add("Calculer racines équation second degré");
			switch (Menu.getChoix(leMenu)) {
			case 0:
				rep = CONVERTIR_BASE_DEUX;
				break;
			case 1:
				rep = CONVERTIR_BASE_DIX;
				break;
			case 2:
				rep = CONVERTIR_BASE_AUTRE;
				break;
			case 3:
				rep = AFFICHER_ASCII;
				break;
			case 4:
				rep = RACINES;
				break;
			default:
				rep = -1;
				break;
			}
			break;
		case CONVERTIR_BASE_DEUX:
			leMenu = new ArrayList<String>();
			leMenu.add("Entrer un nombre à convertir en base 2");
			leMenu.add("Menu Principal");
			switch (Menu.getChoix(leMenu)) {
			case 0:
				convertirBaseDeux();
				rep = CONVERTIR_BASE_DEUX;
				break;
			case 1:
				rep = MENU_PRINCIPAL;
				break;
			default:
				rep = -1;
				break;
			}
			break;
		case CONVERTIR_BASE_DIX:
			leMenu = new ArrayList<String>();
			leMenu.add("Entrer un nombre à convertir en base 10");
			leMenu.add("Menu Principal");
			switch (Menu.getChoix(leMenu)) {
			case 0:
				convertirBaseDix();
				rep = CONVERTIR_BASE_DIX;
				break;
			case 1:
				rep = MENU_PRINCIPAL;
				break;
			default:
				rep = -1;
				break;
			}
			break;
		case CONVERTIR_BASE_AUTRE:
			leMenu = new ArrayList<String>();
			leMenu.add("Entrer un nombre à convertir et une base finale");
			leMenu.add("Menu Principal");
			switch (Menu.getChoix(leMenu)) {
			case 0:
				convertirAutreBase();
				rep = CONVERTIR_BASE_AUTRE;
				break;
			case 1:
				rep = MENU_PRINCIPAL;
				break;
			default:
				rep = -1;
				break;
			}
			break;
		case AFFICHER_ASCII:
			leMenu = new ArrayList<String>();
			leMenu.add("Entrer un nombre à afficher en Ascii Art");
			leMenu.add("Menu Principal");
			switch (Menu.getChoix(leMenu)) {
			case 0:
				afficherAscii();
				rep = AFFICHER_ASCII;
				break;
			case 1:
				rep = MENU_PRINCIPAL;
				break;
			default:
				rep = -1;
				break;
			}
			break;
		case RACINES:
			leMenu = new ArrayList<String>();
			leMenu.add("selon l'équation ax²+bx+c, veuillez indiquer les valeurs des inconnues : ");
			leMenu.add("Menu Principal");
			switch (Menu.getChoix(leMenu)) {
			case 0:
				calculRacines();
				rep = RACINES;
				break;
			case 1:
				rep = MENU_PRINCIPAL;
				break;
			default:
				rep = -1;
				break;
			}
			break;

		default:
			rep = -1;
			break;
		}
		return rep;
	}

	//---Appel methodes---
	private void convertirBaseDeux() {
		boolean condition = true;
		while(condition) {
			Menu.afficheMsg("Valeur du nombre : ");
			String valEntree = Menu.lireString();
			Menu.afficheMsg("Base du nombre : ");
			int baseEntree = Menu.lireInt();
			Base baseSortie = new Base(2);
			Base labaseEntree = new Base(baseEntree);
			Nombre lenombreEntree = new Nombre(valEntree, labaseEntree);
			Menu.afficheMsg("-------------------");
			if(verification(lenombreEntree, labaseEntree)) {
				Menu.afficheMsg(Nombre.convertTo(lenombreEntree.convertToDecimal(), baseSortie));
				condition = false;
			}
			else {
				Menu.afficheMsg("Erreur ! Saisir à nouveau");
				Menu.afficheMsg("-------------------");
			}
		}
	}

	private void convertirBaseDix() {
		boolean condition = true;
		while(condition) {
			Menu.afficheMsg("Valeur du nombre : ");
			String valEntree = Menu.lireString();
			Menu.afficheMsg("Base du nombre : ");
			int baseEntree = Menu.lireInt();
			Base labaseEntree = new Base(baseEntree);
			Nombre lenombreEntree = new Nombre(valEntree, labaseEntree);
			Menu.afficheMsg("-------------------");
			if(verification(lenombreEntree, labaseEntree)) {
				Menu.afficheMsg(lenombreEntree.convertToDecimal());
				condition = false;
			}
			else {
				Menu.afficheMsg("Erreur ! Saisir à nouveau");
				Menu.afficheMsg("-------------------");
			}
		}
	}

	private void convertirAutreBase() {
		boolean condition = true;
		while(condition) {
			Menu.afficheMsg("Valeur du nombre : ");
			String valEntree = Menu.lireString();
			Menu.afficheMsg("Base du nombre : ");
			int baseEntree = Menu.lireInt();
			Base labaseEntree = new Base(baseEntree);
			Menu.afficheMsg("Base finale");
			int baseFinale = Menu.lireInt();
			Base labaseFinale = new Base(baseFinale);
			Nombre lenombreEntree = new Nombre(valEntree, labaseEntree);
			Menu.afficheMsg("-------------------");
			if(verification(lenombreEntree, labaseEntree)) {
				Menu.afficheMsg(Nombre.convertTo(lenombreEntree.convertToDecimal(), labaseFinale));
				condition = false;
			}
			else {
				Menu.afficheMsg("Erreur ! Saisir à nouveau");
				Menu.afficheMsg("-------------------");
			}
		}
	}

	private void afficherAscii() {
		boolean condition = true;
		Base labaseAscii = new Base(BASE_MAX_ASCII_ART);
		while(condition) {
			Menu.afficheMsg("Saisir le nombre à afficher : ");
			Menu.afficheMsg(labaseAscii.getComposition());
			String valAscii = Menu.lireString();
			Nombre lenombreAscii = new Nombre(valAscii, labaseAscii);
			Menu.afficheMsg("-------------------");
			if(verification(lenombreAscii, labaseAscii)) {
				lenombreAscii.asciiArt();
				condition = false;
			} else {
				Menu.afficheMsg("Erreur ! Saisir à nouveau");
				Menu.afficheMsg("-------------------");
			}
		}
	}

	private static void calculRacines() {
		Menu.afficheMsg("a = ");
		double a = Menu.lireDouble();
		Menu.afficheMsg("b = ");
		double b = Menu.lireDouble();
		Menu.afficheMsg("c = ");
		double c = Menu.lireDouble();
		Racines.calculRacines(a, b, c);
	}
	
	//---Verification conditions erreur---
	private static boolean verification(Nombre n, Base b) {
		boolean rep = true;
		for (Chiffre c : n.liste) {
			if (!b.getComposition().contains(c.getValeur())){
				rep = false;
			}
		}
		return rep;
	}

	//---Fonctionnement Menu---
	public void calculer() {
		boolean fini = false;
		int choix = this.getChoix(MENU_PRINCIPAL);
		while (!fini) {
			switch (choix) {
			case -1:
				fini = true;
				break;
			case Controleur.MENU_PRINCIPAL:
				choix = this.getChoix(Controleur.MENU_PRINCIPAL);
				break;
			case Controleur.CONVERTIR_BASE_DEUX:
				choix = this.getChoix(Controleur.CONVERTIR_BASE_DEUX);
				break;
			case Controleur.CONVERTIR_BASE_DIX:
				choix = this.getChoix(Controleur.CONVERTIR_BASE_DIX);
				break;
			case Controleur.CONVERTIR_BASE_AUTRE:
				choix = this.getChoix(Controleur.CONVERTIR_BASE_AUTRE);
				break;
			case Controleur.AFFICHER_ASCII:
				choix = this.getChoix(Controleur.AFFICHER_ASCII);
				break;
			case Controleur.RACINES:
				choix = this.getChoix(Controleur.RACINES);
				break;

			default:
				// Code inaccessible selon nos vérifications
				Menu.afficheMsg(" ## Ré-essayez");
				break;
			}
		}
		Menu.afficheMsg("Au revoir et à bientôt");
	}
}
