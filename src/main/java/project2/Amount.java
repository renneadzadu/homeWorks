package project2;

public class Amount {

    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public final void withdraw(double amount) {
        double newBalance = balance - amount;

        if(newBalance > 0){
            balance = newBalance;
        }


    }
}
