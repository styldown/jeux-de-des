package jeuxdedes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IhmLigneCommande implements InterfaceIHM{
	
	Scanner scanner = new Scanner(System.in);
	private int nbrTours;
	private ArrayList<String> listeJoueur=new ArrayList<String>();
	
	@Override
	public void initialisationParametre(){
		int var=0;
		String nomJoueur;
		while(var==0) {
			System.out.println("Enterz le nombre de lanc�s, le nombre doit etre compris entre 1 et 10: ");
			try {
				var=scanner.nextInt();
				if (var<1 || var>10)
					throw new entreeInvalideException();
			}
			catch (entreeInvalideException exp){
				var=0;
				System.out.println(exp);
			}
			catch (InputMismatchException exp) {
				System.out.println("entr�e invalide");	
			}
			scanner.nextLine();
			}
		nbrTours=var;	
		System.out.println("Entrez le nom de joueur n�1 ou appuyer sur entrer pour sortir");
		nomJoueur=scanner.nextLine();
			
		while(nomJoueur!="") {
			listeJoueur.add(nomJoueur);
			System.out.println("Entrez le nom de joueur n�"+(listeJoueur.size()+1)+" ou appuyer sur entrer pour jouer");
			nomJoueur=scanner.nextLine();
		}
	}
	
	@Override
	public void afficherPostTour(String joueur, int numeroTour) {
		System.out.println("*********Tour n�" + numeroTour+ "*********");
		System.out.println(joueur + " appuyez sur entrer pour jouer.");
		scanner.nextLine();
		}
	
	@Override
	public void afficherPresTour(String joueur, int[] goblet) {
		System.out.println("["+ goblet[0] + ";" + goblet[1] + "]");
		System.out.println(joueur);
		System.out.println();
		
	}
	
	@Override
	public void finPartie() {
		scanner.close();
		System.out.println("******Fin de partie*******");
	}
	
	@Override
	public int getNbrTours() {
		return nbrTours;
	}

	@Override
	public ArrayList<String> getListeJoueur() {
		return listeJoueur;
	}

	@Override
	public void scoreFinal(String joueur,int classement) {
		System.out.println(classement+": " + joueur);
		
	}

	
}
