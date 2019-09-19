import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void getSquare() {
        Rectangle rect = new Rectangle(4, 5);
        Rectangle rect1 = new Rectangle(7, 3);
        Rectangle rect2 = new Rectangle(9, 2);

        int[] expecteds = {20, 21, 18};
        int[] actuals = new int[3];
        actuals[0] = rect.getSquare();
        actuals[1] = rect1.getSquare();
        actuals[2] = rect2.getSquare();

        Assert.assertArrayEquals(expecteds, actuals);
    }
}