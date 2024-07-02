public abstract class BankAccount {

    protected static int balance = 0;

    public int getBalance() {
        return balance;
    }


    public void deposit(int amount) {
        balance += amount;
    }

    abstract void withdraw(int amount);

}
