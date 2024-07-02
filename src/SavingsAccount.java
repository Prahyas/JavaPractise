public class SavingsAccount extends BankAccount {

    @Override
    void withdraw(int amount) {
        balance -= (amount + 20);
    }
}
