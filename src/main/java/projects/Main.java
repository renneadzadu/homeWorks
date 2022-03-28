package projects;

public class Main {
    public static void main(String[] args) {
        Add add = new Add();
        add.setNumbers(20);
        add.calcNumb();

        Subtract subtract =new Subtract();
        subtract.setNumbers(10);
        subtract.setSecondNumb(3);
       subtract.calcNumb();

        Multiply multiply = new Multiply();
        multiply.setNumbers(5);
        multiply.setSecondNumb(3);
        multiply.calcNumb();

        Divide divide = new Divide();
        divide.setNumbers(25);
        divide.setSecondNumb(5);
        divide.calcNumb();

        Square square = new Square();
        square.setNumbers(25);
        square.calcNumb();

        SquareRoot squareRoot = new SquareRoot();
        squareRoot.calcNumb();

        Exponent exponent = new Exponent();
        exponent.setNumbers(5);
        exponent.calcNumb();
    }
}
