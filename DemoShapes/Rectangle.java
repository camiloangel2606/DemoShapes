public class Rectangle extends Square {
    private int height = 0, width = 0;

    public Rectangle(int newwidth, int newheight) {
        super(newwidth);
        setHeight(newheight);
    }

    @Override // Sobreescribimos los metodos de altura.
    public int getHeight() {
        return height;
    }

    @Override // Sobreescribimos los metodos de altura.
    public void setHeight(int newheight) {
        if (newheight > 0)
            height = newheight;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

}
