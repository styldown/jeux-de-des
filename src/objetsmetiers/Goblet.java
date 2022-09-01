package objetsmetiers;

//cette class represente un goblet qui contient deux d�s
class Goblet {
	private final int NB_DES=2;
	private Des premierDes;
	private Des deuxiemeDes;
	private Des goblet[]= new Des[NB_DES];
	//cette variable stock la somme des deux d�s
	private int valeurGoblet;
	
	Des[] getGoblet(){
		return goblet;
		}
	
	int getValeur() {
		return valeurGoblet;
	}
	
	Goblet() {
		premierDes=new Des();
		deuxiemeDes=new Des();
	}
	
	//cette methode simule le lanc� des deux d�s contenus dans le goblet
	void lancer() {
		getPremierDes().rouler();
		getDeuxiemeDes().rouler();
		goblet[0]=getPremierDes();
		goblet[1]=getDeuxiemeDes();
		valeurGoblet=getPremierDes().getValeur() + getDeuxiemeDes().getValeur();
	}
	
	
	public int[] gobletToIhm() {
		int[] retour={this.premierDes.getValeur(),deuxiemeDes.getValeur()};
		return (retour);
	}

	public Des getPremierDes() {
		return premierDes;
	}

	public Des getDeuxiemeDes() {
		return deuxiemeDes;
	}

}