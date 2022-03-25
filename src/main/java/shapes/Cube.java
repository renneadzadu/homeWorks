package shapes;

public class Cube extends Shape {
    @Override
    public void calculateArea(){
        System.out.println(6 * getLength()* getLength());
    }

}
