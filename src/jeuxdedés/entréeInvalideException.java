package jeuxded�s;

import java.util.InputMismatchException;

public class entr�eInvalideException extends InputMismatchException{
	public String toString() {
		return "le nombre de lanc�s doit etre compris entre 1 et 10";
	}
}
