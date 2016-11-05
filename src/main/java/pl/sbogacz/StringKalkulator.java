package pl.sbogacz;

public class StringKalkulator {

    public static int dodaj(final String liczby) {
        String separator = ",|\n";
        String liczbyBezSeparatora = liczby;
        if (liczby.startsWith("//")) {
            int indeksSeparatora = liczby.indexOf("//") + 2;
            separator = liczby.substring(indeksSeparatora, indeksSeparatora + 1);
            liczbyBezSeparatora = liczby.substring(indeksSeparatora + 1);
        }
        return dodaj(liczbyBezSeparatora, separator);
    }

    private static int dodaj(final String liczby, final String separator) {
        int wynik = 0;
        String[] tablicaArg = liczby.split(separator);

        for (String liczba : tablicaArg) {
            if (!liczba.trim().isEmpty()) {
                wynik += Integer.parseInt(liczba);
            }
        }
        return wynik;
    }
}
