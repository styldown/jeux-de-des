package objetsm�tiers;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class D�Test {
	
	D� unD�= new D�();
	// lance dix fois le d� et test si les resultats sont differents
	@Test
	void testRouler() {
		double somme=0;
		for(int i=0; i<10; i++) {
			unD�.rouler();
			//test si var supp a 0 et inf a 7
			assertTrue(unD�.getValeur()>0 && unD�.getValeur()<7, "var doit etre compris entre 1 et 6");
			somme=somme+unD�.getValeur();
			System.out.print(unD�.getValeur()+"-");
		}
		
		//tester si les valeur g�ner�e ne sont pas identiques a chaque lanc�
		assertNotEquals(somme/10,unD�.getValeur(),"les valeur random ne sont pas differente a chaque lanc�");
		
	}

}
