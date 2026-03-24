package thursdaytest;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String langage = "Java";
		String phrase = langage + " cest de la bombe.";
		System.out.println(phrase);
		int somme = Main.addition(18, 17);
				System.out.println(somme);
				affichage("Marty");
				
				Main.commentWeather("qdfdf");
				Main.commentWeather("soleil");
				
				System.out.println(categorieDeFilm("Kaamelott"));
				System.out.println(categorieDeFilm("torsharknado"));
				
				List<String> nomsDesLangages = Arrays.asList("Java", "PHP", "Javascript");
				for(String nomUnLangage : nomsDesLangages) {
					String resultat = nomUnLangage.toUpperCase();
					System.out.println(resultat);
				}
				
		int[] tableau = {4, 8, 15, 16, 23, 42};
		int compteur = 0;
		for(int i=0; i<6; i++) {
			if(tableau[i] == 0) {
				compteur++;
			}
		}
		System.out.println(compteur);
		
		Bloc unBloc = new Bloc("Voilà un premier test de Bloc");
		unBloc.afficherDescription();
		Bloc unAutreBloc = new Bloc("Voilà un 2ème test de Bloc");
		unAutreBloc.afficherDescription();
		
		unBloc.getDescription();
	}
	
	public static int addition(final int entier1, final int entier2) {
		return entier1 + entier2;
	}
	
	public static void second(String[] args) {
		int num;
		num = 7;
		num = 1337;
		final int notMovable = 67;

	}
	
	/*public static void third(String[] args) {
		String salutation = "Hello World";
		
	}
	
	public static void affiche() {
		System.out.println(texte 'Une fonction en Java a été exécutée');
	}

	public static void affiche(String texte) {
	    System.out.println(texte);
	}*/
	
	public static void affichage(final String texte) {
		System.out.println("Bonjour " + texte);
	}
	
	public static void commentWeather(final String meteo) {
		switch(meteo) {
		case "soleil" -> System.out.println("Beau temps");
		case "nuage" -> System.out.println("Couvert");
		case "pluie" -> System.out.println("Mauvais temps");
		default -> System.out.println("Je ne sais pas");
		}
	}
	
	public static String categorieDeFilm(final String film) {
		var resultat = switch(film) {
		case "Kaamelott" -> "Historique";
		case "La tour Montparnasse Infernal", "RRRrrrr" -> "Humour";
		case "Le con de monte kristo" -> {
			String categorie = "Biographie";
			yield categorie;
		}
		default -> "Non communiqué";
		};
		return resultat;
	}
	
	
}
