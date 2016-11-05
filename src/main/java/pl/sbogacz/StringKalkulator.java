package pl.sbogacz;

public class StringKalkulator {

    public static int dodaj(String liczby) {
        int wynik = 0;
        String[] tablicaArg = liczby.split(",|\n");

        for (String liczba : tablicaArg) {
            if (!liczba.trim().isEmpty()) {
                wynik += Integer.parseInt(liczba);
            }
        }
        return wynik;
    }
}
