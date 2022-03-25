package shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(5);
        rectangle.calculateArea();

        Cube cube = new Cube();
        cube.setLength(6);
        cube.calculateArea();

        Triangle triangle = new Triangle();
        triangle.setHeight(5);
        triangle.setBase(8);
        triangle.calculateArea();

        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(3);
        cylinder.setHeight(5);
        cylinder.calculateArea();
    }

    }


