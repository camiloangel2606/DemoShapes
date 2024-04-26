public class Square extends Shape {
    private int width = 0, height = 0;

    public Square(int newwidth) {
        setWidth(newwidth);
    }

    public int getHeight() {
        return width;
    }

    public int getWidth() {
        return width;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    public void setHeight(int newheight) {
        if (newheight > 0)
            width = newheight;
    }

    public void setWidth(int newwidth) {
        if (newwidth > 0)
            width = newwidth;
    }
}
