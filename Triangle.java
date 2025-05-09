package graphics;

public class Triangle implements Shape {
    double base, height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void area() {
        System.out.println("Area of Triangle: " + (0.5 * base * height));
    }
}

