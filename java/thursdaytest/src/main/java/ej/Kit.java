package ej;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Kit {
    
    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> motsCles = new LinkedHashSet<String>();
    
    
    public Kit() {
        blocs.add(new Mur(3,2,2,true));
        blocs.add(new Mur(3,2,2,true));
        blocs.add(new Mur(2,1,2,false));
        blocs.add(new Mur(2,1,2,false));
        blocs.add(new Porte(1,2,2,false));
        
        //motsCles.add( "cabane");
        //motsCles.add( "muraille");
    }
    
    public void afficherKit() {
    	System.out.println("Nombre de blocs dans le kit : " + blocs.size());
    	System.out.print("Liste des mots clés du kit : ");
    	for(String motCle : motsCles) {
    		System.out.print(motCle + " ");
    	};
    }
    
        public Set<String> getMotsCles() {
            return motsCles;
        }
        
        public Set<IBloc> getBlocs() {
            return blocs;
        }
}
