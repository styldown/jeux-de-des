package objetsm�tiers;

import jeuxded�s.*;
import java.util.ArrayList;

//Cette classe est public car elle represente le lien des ojets metiers avec le reste de l'application
public final class Partie {
	Goblet goblet;
	public int nbrLanc�;
	private ArrayList<Joueur> listeJoueur =new ArrayList<Joueur>();
	InterfaceIHM iHM;
	
	//initialesr la partie grace a l'IHM
	public Partie(InterfaceIHM iHM) {
		this.iHM=iHM;
		goblet=new Goblet();
		nbrLanc�=iHM.getNbrLanc�();
		iHM.getListeJoueur().forEach((n) -> listeJoueur.add(new Joueur(n, this)));
	}
	
	//parcour la liste des joueur et leurs donne la main; l'operation se repete selon le nbr de lanc�s definit 
	public void lancerPartie() {
		for (int i=1; i<=nbrLanc�; i++) {
			int numeroLanc�=i;
			listeJoueur.forEach((n) -> unLanc�(n,numeroLanc� ));
		}	
	}
	
	//permets a un joueur de lancer son goblet et affiche les resultat
	private void unLanc�(Joueur j, int numeroLanc�) {
		iHM.afficherPostTour(j.toString(), numeroLanc�);
		j.jouer();
		iHM.afficherPresTour(j.toString(), goblet.gobletToIhm());
	}
	
	// trie la liste des joueur selon leurs score et appel l'ihm pour afficher les resultat
	public void scoreFinal() {
		ArrayList<Joueur> listJoueurClass�=Joueur.classement(listeJoueur);
		listJoueurClass�.forEach((n) ->  iHM.scoreFinal(n.toString(),listJoueurClass�.indexOf(n)+1));
	}
	
	public void finPartie() {
		iHM.finPartie();
	}
	
}
	
