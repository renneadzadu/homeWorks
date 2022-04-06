package persons;

public class Entrepreneur extends Person implements IPayable{
private double income;



    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
        System.out.println("Robert Mark");
    }

    @Override
    public void calculatePay() {
        System.out.println();
    }
}

