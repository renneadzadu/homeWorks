package persons;

public abstract class Person { /*
Part 2 - Things Objects have
Every Person has a name
Employees and Entrepreneurs are people
SalariedEmployees have a salary
HourlyEmployees have hourlyRate and hoursWorked
Entrepreneurs have an income
Part 3 - Things objects can do
issueBadge(which takes an array of Employees) and prints each employee's badge
printPay(Takes a payable person) and prints out their payment information

*/

    private String name;


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
