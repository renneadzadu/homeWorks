package project2;

public class Calc {

    private double number1;
    private double number2;

    public Calc(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void add() {
        System.out.println(getNumber1()+getNumber2());
    }
    public void subtract() {
        System.out.println(getNumber1()- getNumber2());
    }

    public void multiply() {
        System.out.println(getNumber1()* getNumber2());
    }
    public void exponent() {
        System.out.println(Math.pow(getNumber1(), getNumber2()));
    }
    public void divide() {
        System.out.println(getNumber1() / getNumber2());
    }
    public void square() {
        System.out.println(getNumber1()* getNumber1());
    }
    public void squareRoot() {
        System.out.println(Math.sqrt(getNumber1()));
    }


    public double getNumber1() {
        return this.number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return this.number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
}

}
