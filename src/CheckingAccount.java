public class CheckingAccount extends BankAccount implements Interest {

    @Override
    void withdraw(double amount) {
        balance -= (amount + 10.00);
    }

    @Override
    public void applyInterest() {
        balance = balance + (balance * 0.07);
    }
}
