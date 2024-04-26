public class Triangle extends Shape {
    private int side1 = 0, side2 = 0, side3 = 0;

    public Triangle(int newside1, int newside2, int newside3) {
        setSide1(newside1);
        setSide2(newside2);
        setSide3(newside3);
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getSide3() {
        return side3;
    }

    public double getArea() {
        double s = 0;
        s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public void setSide1(int newside1) {
        if (newside1 > 0)
            side1 = newside1;
    }

    public void setSide2(int newside2) {
        if (newside2 > 0)
            side2 = newside2;
    }

    public void setSide3(int newside3) {
        if (newside3 > 0)
            side3 = newside3;
    }
}
