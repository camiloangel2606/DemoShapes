public class Test {

    public static void main(String [] args){
        Shape [] shapes = new Shape[]{//Creamos una lista para almacenar los datos de las figuras.
            
        }
        Shape shape = new Shape();
        shape.setX(10);
        
        Circle circle = new Circle();
        circle.setX(20);
        circle.setRadius(20);

        Square square = new Square();
        square.setHeight(-10);
        square.setWidth(-20);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(10);
        rectangle.setWidth(20);

        Ellipse ellipse = new Ellipse();
        ellipse.setRadius(-3);
        ellipse.setRadius2(6);

        Triangle triangle = new Triangle();
        triangle.setSide1(8);
        triangle.setSide2(-9);
        triangle.setSide3(4);

        
        Console.writeLine(shape.getX());
        Console.writeLine(circle.getX());

        Console.writeLine("Square");
        Console.writeLine(square.getHeight());
        Console.writeLine(square.getWidth());

        Console.writeLine("Rectangle");
        Console.writeLine(rectangle.getHeight());
        Console.writeLine(rectangle.getWidth());

        Console.writeLine("Ellipse");
        Console.writeLine(ellipse.getRadius());
        Console.writeLine(ellipse.getRadius2());

        Console.writeLine("Triangle");
        Console.writeLine(triangle.getSide1());
        Console.writeLine(triangle.getSide2());
        Console.writeLine(triangle.getSide3());
    }

}