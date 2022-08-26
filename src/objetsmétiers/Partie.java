package objetsmétiers;

import jeuxdedés.*;
import java.util.ArrayList;

//Cette classe est public car elle represente le lien des ojets metiers avec le reste de l'application
public final class Partie {
	Goblet goblet;
	public int nbrLancé;
	private ArrayList<Joueur> listeJoueur =new ArrayList<Joueur>();
	InterfaceIHM iHM;
	
	//initialesr la partie grace a l'IHM
	public Partie(InterfaceIHM iHM) {
		this.iHM=iHM;
		goblet=new Goblet();
		nbrLancé=iHM.getNbrLancé();
		iHM.getListeJoueur().forEach((n) -> listeJoueur.add(new Joueur(n, this)));
	}
	
	//parcour la liste des joueur et leurs donne la main; l'operation se repete selon le nbr de lancés definit 
	public void lancerPartie() {
		for (int i=1; i<=nbrLancé; i++) {
			int numeroLancé=i;
			listeJoueur.forEach((n) -> unLancé(n,numeroLancé ));
		}	
	}
	
	//permets a un joueur de lancer son goblet et affiche les resultat
	private void unLancé(Joueur j, int numeroLancé) {
		iHM.afficherPostTour(j.toString(), numeroLancé);
		j.jouer();
		iHM.afficherPresTour(j.toString(), goblet.gobletToIhm());
	}
	
	// trie la liste des joueur selon leurs score et appel l'ihm pour afficher les resultat
	public void scoreFinal() {
		ArrayList<Joueur> listJoueurClassé=Joueur.classement(listeJoueur);
		listJoueurClassé.forEach((n) ->  iHM.scoreFinal(n.toString(),listJoueurClassé.indexOf(n)+1));
	}
	
	public void finPartie() {
		iHM.finPartie();
	}
	
}
	
