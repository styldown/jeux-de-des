package objetsm�tiers;

//cette class represente un goblet qui contient deux d�s
class Goblet {
	private final int NB_DES=2;
	private D� premierD�;
	private D� deuxiemeD�;
	private D� goblet[]= new D�[NB_DES];
	//cette variable stock la somme des deux d�s
	private int valeurGoblet;
	
	D�[] getGoblet(){
		return goblet;
		}
	
	int getValeur() {
		return valeurGoblet;
	}
	
	Goblet() {
		premierD�=new D�();
		deuxiemeD�=new D�();
	}
	
	//cette methode simule le lanc� des deux d�s contenus dans le goblet
	void lancer() {
		getPremierD�().rouler();
		getDeuxiemeD�().rouler();
		goblet[0]=getPremierD�();
		goblet[1]=getDeuxiemeD�();
		valeurGoblet=getPremierD�().getValeur() + getDeuxiemeD�().getValeur();
	}
	
	
	public int[] gobletToIhm() {
		int[] retour={this.premierD�.getValeur(),deuxiemeD�.getValeur()};
		return (retour);
	}

	public D� getPremierD�() {
		return premierD�;
	}

	public D� getDeuxiemeD�() {
		return deuxiemeD�;
	}

}