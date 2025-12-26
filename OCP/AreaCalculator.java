public class AreaCalculator {
    public double calculateArea(Object shape) {
        double area = 0;
        if (shape instanceof Rectangle) {
            Rectangle rect = (Rectangle) shape;
            area = rect.getWidth() * rect.getHeight();
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            area = Math.PI * circle.getRadius() * circle.getRadius();
        }
        return area;
    }
}

class Rectangle {
    private double width, height;
    public double getWidth() { return width; }
    public double getHeight() { return height; }
}

class Circle {
    private double radius;
    public double getRadius() { return radius; }
}