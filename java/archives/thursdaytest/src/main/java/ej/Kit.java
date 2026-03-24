package ej;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import ej.blocs.Bloc;
import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;
import ej.Liste;

public class Kit {
    
    private Set<IBloc> blocs = new LinkedHashSet<IBloc>();
    private Set<String> motsCles = new LinkedHashSet<String>();
    
    
    public Kit() throws IllegalBlocException {
        this.blocs.add(new Mur(3,2,2,true));
        this.blocs.add(new Mur(3,2,2,true));
        this.blocs.add(new Mur(2,1,2,false));
        this.blocs.add(new Mur(2,1,2,false));
        this.blocs.add(new Porte(1,2,2,false));

        this.motsCles.add("cabane");
        this.motsCles.add("muraille");
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
