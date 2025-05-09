package graphics;

public class Square implements Shape {
    double side;

    public Square(double side) {
        this.side = side;
    }

    public void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

