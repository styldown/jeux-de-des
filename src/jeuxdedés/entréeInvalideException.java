package jeuxdedés;

import java.util.InputMismatchException;

public class entréeInvalideException extends InputMismatchException{
	public String toString() {
		return "le nombre de lancés doit etre compris entre 1 et 10";
	}
}
