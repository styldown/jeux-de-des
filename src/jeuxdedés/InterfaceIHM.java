package jeuxded�s;

import java.util.ArrayList;

public interface InterfaceIHM {
	public abstract void initialisationParametre();
	public abstract void afficherPostTour(String joueur, int numeroLanc�);
	public abstract void afficherPresTour(String joueur, int[] goblet);
	public abstract void finPartie();
	public abstract int getNbrLanc�();
	public abstract ArrayList<String> getListeJoueur();
	public abstract void scoreFinal(String joueur,int classement);
}
