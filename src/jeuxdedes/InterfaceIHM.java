package jeuxdedes;

import java.util.ArrayList;

public interface InterfaceIHM {
	public abstract void initialisationParametre();
	public abstract void afficherPostTour(String joueur, int numeroTour);
	public abstract void afficherPresTour(String joueur, int[] goblet);
	public abstract void finPartie();
	public abstract int getNbrTours();
	public abstract ArrayList<String> getListeJoueur();
	public abstract void scoreFinal(String joueur,int classement);
}
