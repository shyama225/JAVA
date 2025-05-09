import graphics.*;

public class TestGraphics {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(8, 4);
        Shape square = new Square(6);
        Shape circle = new Circle(7);

        rectangle.area();
        triangle.area();
        square.area();
        circle.area();
    }
}

