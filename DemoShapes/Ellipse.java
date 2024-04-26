public class Ellipse extends Circle {
    private int Radius2 = 0;

    public Ellipse(int newradius, int newradius2) {
        super(newradius);
        setRadius2(newradius2);
    }

    public int getRadius2() {
        return Radius2;
    }

    public double getArea() {
        return radius * Radius2 * Math.PI;
    }

    public double getPerimeter() {
        return Math.PI * (radius + Radius2);
    }

    public void setRadius2(int newradius2) {
        if (newradius2 > 0)
            Radius2 = newradius2;
    }
}
