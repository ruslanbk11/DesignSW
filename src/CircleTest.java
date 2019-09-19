import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void getSquare() {
        Circle circle = new Circle(3);
        Circle circle1 = new Circle(8);
        Circle circle2 = new Circle(21);

        float[] expecteds = {28.26f, 200.96f, 1384.74f};
        float[] actuals = new float[3];
        actuals[0] = circle.getSquare();
        actuals[1] = circle1.getSquare();
        actuals[2] = circle2.getSquare();

        Assert.assertArrayEquals(expecteds, actuals, 0.3f);
    }
}