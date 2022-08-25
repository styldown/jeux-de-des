package objetsmétiers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DéTest {
	
	Dé unDé= new Dé();
	// lance dix fois le dé et test si les resultats sont differents
	@Test
	void testRouler() {
		double somme=0;
		for(int i=0; i<10; i++) {
			unDé.rouler();
			//test si var supp a 0 et inf a 7
			assertTrue(unDé.getValeur()>0 && unDé.getValeur()<7, "var doit etre compris entre 1 et 6");
			somme=somme+unDé.getValeur();
			System.out.print(unDé.getValeur()+"-");
		}
		
		//tester si les valeur génerée ne sont pas identiques a chaque lancé
		assertNotEquals(somme/10,unDé.getValeur(),"les valeur random ne sont pas differente a chaque lancé");
		
	}

}
