package objetsmétiers;

import java.util.ArrayList;

//cette classse represente un joueur qui joue une partie 
class Joueur {
	private String nomJoueur;
	private int score;
	//cet argument nous permets de faire un lien entre un joueur et la partie a laquelle il joue
	private Partie partie;
	
	Joueur(String nom, Partie p) {
		nomJoueur=nom;
		partie=p;
	}
	
	public String getNomJoueur() {
		return nomJoueur;
	}
	
	public int  getScore() {
		return score;
	}
	
	public void  setScore(int a) {
		score=a;
	}
	
	public Joueur() {
		
	}
	// cette methode permet au jouer de lancer son goblet une fois
	void jouer(){
			partie.goblet.lancer();
			score += partie.goblet.getValeur();	
	}
	
	public String toString(){
		return (nomJoueur + " votre score est " + score);
	}
	
	//trier une liste de joueur pour etablir un classement
	static ArrayList<Joueur> classement(ArrayList<Joueur> list) {
		ArrayList<Joueur> listeTriée=new ArrayList<Joueur>();
		while(list.size()!=0) {
			Joueur jMax=list.get(0);
			for(Joueur j : list) {
				if(j.score > jMax.score) {
					jMax=j;
				}
			}
			listeTriée.add(jMax);
			list.remove(jMax);
			}
		return listeTriée;
		}

		
}
