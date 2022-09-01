package objetsmetiers;
import java.util.Random;

//Cette classe represente un d�
class Des{
	
	//represente la valeur de la face du d�
	private int valeur;
	private Random random = new Random();
	Des() {
		valeur=4;
	}
	
	//affecte, a la variable valeur, une valeur entre 1 et 6
	void rouler() {
		valeur=random.nextInt(6) + 1;
		}

	int getValeur() {
		return valeur;
	}

	
}
