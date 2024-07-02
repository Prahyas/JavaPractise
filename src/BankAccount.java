public abstract class BankAccount {

    protected static double balance = 0;

    public double getBalance() {
        return balance;
    }


    public void deposit(int amount) {
        balance += amount;
    }

    abstract void withdraw(double amount);

}
