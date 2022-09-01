package jeuxdedes;

import java.util.InputMismatchException;

public class entreeInvalideException extends InputMismatchException{
	public String toString() {
		return "le nombre de lanc�s doit etre compris entre 1 et 10";
	}
}
