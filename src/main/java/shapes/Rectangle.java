package shapes;

public class Rectangle extends Shape{
    private double width;
    @Override
    public void calculateArea(){
        System.out.println(this.width * getLength());
    }






    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
}
