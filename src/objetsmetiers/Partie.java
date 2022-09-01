package objetsmetiers;

import jeuxdedes.*;
import java.util.ArrayList;

//Cette classe est public car elle represente le lien des ojets metiers avec le reste de l'application
public final class Partie {
	Goblet goblet;
	public int nbrTour;
	private ArrayList<Joueur> listeJoueur =new ArrayList<Joueur>();
	InterfaceIHM iHM;
	
	//initialesr la partie grace a l'IHM
	public Partie(InterfaceIHM iHM) {
		this.iHM=iHM;
		goblet=new Goblet();
		nbrTour=iHM.getNbrTours();
		iHM.getListeJoueur().forEach((n) -> listeJoueur.add(new Joueur(n, this)));
	}
	
	//parcour la liste des joueur et leurs donne la main; l'operation se repete selon le nbr de lanc�s definit 
	public void lancerPartie() {
		for (int i=1; i<=nbrTour; i++) {
			int numeroTour=i;
			listeJoueur.forEach((n) -> unTour(n,numeroTour));
		}	
	}
	
	//permets a un joueur de lancer son goblet et affiche les resultat
	private void unTour(Joueur j, int numeroTour) {
		iHM.afficherPostTour(j.toString(), numeroTour);
		j.jouer();
		iHM.afficherPresTour(j.toString(), goblet.gobletToIhm());
	}
	
	// trie la liste des joueur selon leurs score et appel l'ihm pour afficher les resultat
	public void scoreFinal() {
		ArrayList<Joueur> listJoueurClasser=Joueur.classement(listeJoueur);
		listJoueurClasser.forEach((n) ->  iHM.scoreFinal(n.toString(),listJoueurClasser.indexOf(n)+1));
	}
	
	public void finPartie() {
		iHM.finPartie();
	}
	
}
	
