interface Shape {
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Drawing a Circle for one");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Square for two");
    }
}

class Triangle implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a Triangle for three");
    }
}
public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Triangle();

        for(Shape shape : shapes) {
            shape.draw();
        }
    }
}
