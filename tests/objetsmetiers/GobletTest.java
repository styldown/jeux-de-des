package objetsmetiers;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.RepeatedTest;

import objetsmetiers.Des;
import objetsmetiers.Goblet;

class GobletTest {
	Goblet unGoblet=new Goblet();
	
	@RepeatedTest (15)    
	void testLancer() {
		unGoblet.lancer();
		assertTrue((unGoblet.getGoblet()[0] instanceof Des) && (unGoblet.getGoblet()[1] instanceof Des));
		int[] var=unGoblet.gobletToIhm();
		System.out.println("["+ var[0] + ";" + var[1] + "]");;
	}

}