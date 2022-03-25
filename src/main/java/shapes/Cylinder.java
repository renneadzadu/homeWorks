package shapes;

public class Cylinder extends Shape {
    private double Radius;
@Override
    public void calculateArea() {
        System.out.println(2 * Math.PI * getRadius() * getHeight() + 2 * Math.PI * getRadius()*getRadius());

    }




    public double getRadius() {
        return this.Radius;
    }
    public void setRadius(double radius){
    this.Radius =radius;
    }
}
