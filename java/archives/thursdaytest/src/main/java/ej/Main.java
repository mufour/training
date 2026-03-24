package ej;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import ej.blocs.Porte;
//import java.util.LinkedHashSet;
//import java.util.Map;
//import java.util.Set;
//import java.util.HashMap;

public class Main {

	public static Logger logger = LogManager.getLogger(Main.class);
	
    public static void main(String[] args) {
       /*Map<Bloc, Integer> quantiteBloc = new HashMap<Bloc, Integer>();
       quantiteBloc.put(new Mur(1,1,1,true), 4);
       quantiteBloc.put(new Porte(1,1,1,false), 4);
       
       Set<Bloc> cles = quantiteBloc.keySet();
       for(Bloc cle : cles) { 
    	   Integer valeur = quantiteBloc.get(cle);
    	  System.out.println(cle.getClass().getName() + " : " + valeur); 
       }
    }*/
    	logger.error("Test de logging");
    	
    	try {
    	    Kit kitDeDemarrage = new Kit();
    	    int resultat = kitDeDemarrage.getMotsCles().size();
    	    System.out.println("Nombre de mots clés : " + resultat);
    	} catch (IllegalBlocException e) {
    	    logger.error("Erreur lors de la création du kit", e);
    	    System.out.println("Valeurs pour construire le bloc invalides");
    	}
    }
    
}