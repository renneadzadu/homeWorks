package persons;

public class SalariedEmployee extends  Employee implements IPayable{
    private Double salary;

    public SalariedEmployee(String issuebadge) {
        super(issuebadge);
        System.out.println("Name: Mark");
    }


    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public void calculatePay(){
        System.out.println("$" + getSalary() +"per year");
    }
}
