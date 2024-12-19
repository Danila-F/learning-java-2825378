public class BankAccount {
    private String owner;
    private double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = Math.max(balance, 0);
    }

    public String getOwner() {
        return this.owner;
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double value) {
        if (value > 0 && this.balance >= 0 && value <= this.balance) {
            this.balance -= value;
        } else {
            System.out.println("Invalid withdraw value or negative balance.");
        }
    }

    public void deposit(double value) {
        if (value > 0) {
            this.balance += value;
        } else {
            System.out.println("Invalid deposit value.");
        }
    }
}
