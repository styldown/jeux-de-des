package objetsmetiers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import objetsmetiers.Des;

class DesTest {
	
	Des unDes= new Des();
	// lance dix fois le d� et test si les resultats sont differents
	@Test
	void testRouler() {
		double somme=0;
		for(int i=0; i<10; i++) {
			unDes.rouler();
			//test si var supp a 0 et inf a 7
			assertTrue(unDes.getValeur()>0 && unDes.getValeur()<7, "var doit etre compris entre 1 et 6");
			somme=somme+unDes.getValeur();
			System.out.print(unDes.getValeur()+"-");
		}
		
		//tester si les valeur g�ner�e ne sont pas identiques a chaque lanc�
		assertNotEquals(somme/10,unDes.getValeur(),"les valeur random ne sont pas differente a chaque lanc�");
		
	}

}
