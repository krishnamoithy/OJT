interface Shape {
    double calarea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calarea() {
        return length * width;
    }
}

public class InterfaceE {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10, 5);
        System.out.println("Area of the rectangle: " + rec.calarea());
    }
}
