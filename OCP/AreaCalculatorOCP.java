interface Shape {
    double calculateArea();
}

class RectangleOCP implements Shape {
    private double width, height;
    public double calculateArea() { return width * height; }
}

class CircleOCP implements Shape {
    private double radius;
    public double calculateArea() { return Math.PI * radius * radius; }
}

public class AreaCalculatorOCP {
    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}