package ej;

public class Mur extends Bloc {
	
	private boolean porteur;

	public Mur(int longueur, int largeur, int hauteur, final boolean porteur ) {
        super(longueur, largeur, hauteur); // appel du constructeur de la classe mère
        this.porteur = porteur;
        this.couleur = Couleur.MARRON;
    }
    
	public boolean estPorteur() {
		return porteur;
	}
	
	// @Override
	//public void afficherDescription() {
	//	System.out.println("Je suis un mur");
	// }
	
    /*public void afficherBloc() {
        System.out.println(
            super.longueur + " " +
            super.largeur + " " +
            super.hauteur + " " +
            this.porteur);
    }
    
   @Override
    public void afficheUneDescription(final String description) {
    	System.out.println(description);
    }
    
   public void afficheUneDescription() {
    	this.afficheUneDescription("Je suis une Mûre");
    }*/
}