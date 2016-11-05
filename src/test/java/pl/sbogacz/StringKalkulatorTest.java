package pl.sbogacz;

import org.junit.Assert;
import org.junit.Test;

public class StringKalkulatorTest {

    @Test
    public final void gdyPodano2LiczbyWtedyNieRzucajWyjatku() {
        StringKalkulator.dodaj("1,2");
        Assert.assertTrue(true);
    }

    @Test(expected = RuntimeException.class)
    public final void gdyPodanoWartoscNieliczbowaWtedyRzucWyjatek() {
        StringKalkulator.dodaj("1,X");
    }

    @Test
    public final void gdyPodanoPustyStringWtedy0() {
        int expected = 0;
        int actual = StringKalkulator.dodaj("");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public final void gdyPodanoJednaLiczbeWtedyZwrocDokladnieTaSamaLiczbe() {
        int expected = 3;
        int actual = StringKalkulator.dodaj("3");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public final void gdyPodanoDwieLiczbyWtedyZwrocSumeTychLiczb() {
        int expected = 3+6;
        int actual = StringKalkulator.dodaj("3,6");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public final void gdyPodanoDowolnaIloscLiczbWtedyZwrocSumeTychLiczb() {
        int expected = 3+6+12+14+16+33+47;
        int actual = StringKalkulator.dodaj("3,6,12,14,16,33,47");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public final void gdyNowaLiniaPomiedzyLiczbamiWtedyZwrocSumeTychLiczb() {
        int expected = 3+6+15;
        int actual = StringKalkulator.dodaj("3\n6\n15");
        Assert.assertEquals(expected, actual);
    }
    @Test
    public final void gdyZdefiniowanoSeparatorWtedyZwrocSumeLiczb() {
        int expected = 3+6+15;
        int actual = StringKalkulator.dodaj("//;3;6;15");
        Assert.assertEquals(expected, actual);
    }
}