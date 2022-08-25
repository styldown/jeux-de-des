package objetsmétiers;
import java.util.Random;

//Cette classe represente un dé
class Dé {
	
	//represente la valeur de la face du dé
	private int valeur;
	private Random random = new Random();
	Dé() {
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
