package pl.sbogacz;

public class StringKalkulator {

	public static void dodaj(String liczby) {
		String[] tablicaArg = liczby.split(",");
		if (tablicaArg.length > 2) {
			throw new RuntimeException("Dopuszczalne sa dwie liczby rozdzielone przecinkiem");
		} else {
			for (String liczba : tablicaArg) {
				Integer.parseInt(liczba);
			}
		}
	}
}
