package objetsm�tiers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;

class GobletTest {
	Goblet unGoblet=new Goblet();
	
	@RepeatedTest (15)    
	void testLancer() {
		unGoblet.lancer();
		assertTrue((unGoblet.getGoblet()[0] instanceof D�) && (unGoblet.getGoblet()[1] instanceof D�));
		int[] var=unGoblet.gobletToIhm();
		System.out.println("["+ var[0] + ";" + var[1] + "]");;
	}

}