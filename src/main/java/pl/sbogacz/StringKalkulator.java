package pl.sbogacz;

public class StringKalkulator {

    public static int dodaj(String liczby) {
        int wynik = 0;
        String[] tablicaArg = liczby.split(",");
        if (tablicaArg.length > 2) {
            throw new RuntimeException("Dopuszczalne sa dwie liczby rozdzielone przecinkiem");
        } else {
            for (String liczba : tablicaArg) {
                if (!liczba.isEmpty()) {
                    wynik += Integer.parseInt(liczba);
                }
            }
        }
        return wynik;
    }
}
