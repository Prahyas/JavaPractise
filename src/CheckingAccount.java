public class CheckingAccount extends BankAccount {

    @Override
    void withdraw(int amount) {
        balance -= (amount + 10);
    }
}
