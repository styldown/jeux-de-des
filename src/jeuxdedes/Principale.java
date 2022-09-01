package jeuxdedes;

import objetsmetiers.*;

//fait le lien entre l'ihm et la class partie definie dans le package objetsmetiers
public class Principale{
	public static void main(String[] args) {
		//si vous implementer une nouvelle IHM, il suffit de le specifier ici
		InterfaceIHM iHM=new IhmLigneCommande();
		iHM.initialisationParametre();
		Partie partie = new Partie(iHM);
		partie.lancerPartie();
		partie.finPartie();
		partie.scoreFinal();	
		}	
}
