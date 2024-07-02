public class Main {


    public static void main(String[] args) {
        CheckingAccount prahyas = new CheckingAccount();
        prahyas.deposit(1000);
        prahyas.applyInterest();
        prahyas.withdraw(10);
        System.out.println(prahyas.getBalance());

        SavingsAccount prahyasSaving = new SavingsAccount();
        prahyasSaving.withdraw(10);
        System.out.println(prahyasSaving.getBalance());
    }
}