public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public float getSquare() {
        return radius*radius*3.14f;
    }
}
