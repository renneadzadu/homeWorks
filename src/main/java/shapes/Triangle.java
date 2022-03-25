package shapes;

public class Triangle extends Shape{
    private double base;
    @Override
    public void calculateArea(){
        System.out.println(getBase() * getHeight() / 2);
    }




    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base=base;
    }
}
