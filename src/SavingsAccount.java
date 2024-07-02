public class SavingsAccount extends BankAccount {

    @Override
    void withdraw(double amount) {
        balance -= (amount + 20.00);
    }
}
