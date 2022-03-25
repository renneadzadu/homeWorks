package question1;

public class Box {
    private double length;
    private double width;
    private String color;


    //print label

    public void printLabel(){
        System.out.println("The dimensions of this box is length of " + this.length + " and the width is " + width);
    }



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
