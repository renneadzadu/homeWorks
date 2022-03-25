package shapes;

public class Shape {
    private double length;
    private double height;


    public void calculateArea(){
        System.out.println("i do k");
    }

    public double getLength() {
        return this.length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }
}
