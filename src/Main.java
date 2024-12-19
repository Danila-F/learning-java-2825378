public class Main {

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Danila F", 0);
        account1.withdraw(10);
        System.out.println("Bank account of " + account1.getOwner() + " with current balance: " + account1.getBalance());
        account1.deposit(100);
        System.out.println("Bank account of " + account1.getOwner() + " with current balance: " + account1.getBalance());
        account1.withdraw(-10);
        System.out.println("Bank account of " + account1.getOwner() + " with current balance: " + account1.getBalance());
        account1.withdraw(20);
        System.out.println("Bank account of " + account1.getOwner() + " with current balance: " + account1.getBalance());
        account1.withdraw(200);
        System.out.println("Bank account of " + account1.getOwner() + " with current balance: " + account1.getBalance());
    }
}
