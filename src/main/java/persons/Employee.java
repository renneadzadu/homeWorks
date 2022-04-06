package persons;

public abstract class Employee extends Person {
private String issueBadge;

    @Override
    public void setName(String name) {
        super.setName(name);
        System.out.println("Becca Brake");
    }

    public Employee(String employee) {
        this.issueBadge = issueBadge;
    }

    public String getIssueBadge() {
        return issueBadge;
    }

    public void setIssueBadge(String issueBadge) {
        this.issueBadge = issueBadge;
    }
}
