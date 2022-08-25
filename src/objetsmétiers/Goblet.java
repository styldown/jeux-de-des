package objetsmétiers;

//cette class represente un goblet qui contient deux dés
class Goblet {
	private final int NB_DES=2;
	private Dé premierDé;
	private Dé deuxiemeDé;
	private Dé goblet[]= new Dé[NB_DES];
	//cette variable stock la somme des deux dés
	private int valeurGoblet;
	
	Dé[] getGoblet(){
		return goblet;
		}
	
	int getValeur() {
		return valeurGoblet;
	}
	
	Goblet() {
		premierDé=new Dé();
		deuxiemeDé=new Dé();
	}
	
	//cette methode simule le lancé des deux dés contenus dans le goblet
	void lancer() {
		getPremierDé().rouler();
		getDeuxiemeDé().rouler();
		goblet[0]=getPremierDé();
		goblet[1]=getDeuxiemeDé();
		valeurGoblet=getPremierDé().getValeur() + getDeuxiemeDé().getValeur();
	}
	
	
	public int[] gobletToIhm() {
		int[] retour={this.premierDé.getValeur(),deuxiemeDé.getValeur()};
		return (retour);
	}

	public Dé getPremierDé() {
		return premierDé;
	}

	public Dé getDeuxiemeDé() {
		return deuxiemeDé;
	}

}