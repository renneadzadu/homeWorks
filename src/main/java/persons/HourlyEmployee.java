package persons;

public class HourlyEmployee extends Employee implements IPayable{
private double hourlyRate;
private  int hoursWorked;

    public HourlyEmployee(String employee) {
        super(employee);
    }


    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void calculatePay() {
        System.out.println(hourlyRate * hoursWorked);
    }

}
