package pl.sbogacz;
import org.junit.Assert;
import org.junit.Test;
 
public class StringKalkulatorTest {
    @Test(expected = RuntimeException.class)
    public final void gdyPodanoWiecejNiz2LiczbyWtedyRzucWyjatek() {
        StringKalkulator.dodaj("1,2,3");
    }
    @Test
    public final void gdyPodano2LiczbyWtedyNieRzucajWyjatku() {
        StringKalkulator.dodaj("1,2");
        Assert.assertTrue(true);
    }
    @Test(expected = RuntimeException.class)
    public final void gdyPodanoWartoscNieliczbowaWtedyRzucWyjatek() {
        StringKalkulator.dodaj("1,X");
    }
}