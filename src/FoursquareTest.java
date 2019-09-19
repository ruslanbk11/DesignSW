import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FoursquareTest {

    @Test
    public void getSquare() {
        Foursquare fsq = new Foursquare(5);
        Foursquare fsq1 = new Foursquare(9);
        Foursquare fsq2 = new Foursquare(6);

        int[] expecteds = {25, 81, 36};
        int[] actuals = new int[3];
        actuals[0] = fsq.getSquare();
        actuals[1] = fsq1.getSquare();
        actuals[2] = fsq2.getSquare();

        Assert.assertArrayEquals(expecteds, actuals);
    }
}