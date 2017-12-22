package ihm;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public Menu() {
		super();
	}

	public static int getChoix(ArrayList<String> lignes){
		int nbChoix=lignes.size();
		int choix=0;

		try{
			System.out.println("-------------------");
			for (int i = 0; i < nbChoix; i++) {
				System.out.println(i+" : "+lignes.get(i));
			}
			System.out.println(nbChoix+" : Quitter");
			System.out.println("-------------------");
			Scanner sc = new Scanner(System.in); 
			do{
				System.out.println("saisissez votre choix");
				choix = sc.nextInt(); 
			}while (choix<0 || choix>nbChoix);

		}catch(InputMismatchException e) {
			// Le corps du catch correspond au fonctionnement anormal : l'exception qui a été détectée
			// ici : InputMismatchException = il est possible que le caractère frappé au clavier ne soit pas un entier.
			// Dans ce cas, on demande une nouvelle saisie.
			System.out.println("choix non possible");
			return Menu.getChoix(lignes);
		}
		if (choix==nbChoix) {
			choix = -1;
		}
		return choix;
	}

	public static String lireString(){
		Scanner sc = new Scanner(System.in); 
		return sc.next();
	}
	
	public static double lireDouble(){
		Scanner sc = new Scanner(System.in); 
		return sc.nextDouble();
	}
	
	public static int lireInt(){
		Scanner sc = new Scanner(System.in); 
		return sc.nextInt();
	}

	public static void afficheMsg(String msg){
		System.out.println(msg);
	}
	
	public static void afficheMsg(int msg){
		System.out.println(msg);
	}
	
	public static void afficheMsg(ArrayList<Character> composition) {
		System.out.println(composition);
	}
}



