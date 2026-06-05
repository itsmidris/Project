package BankAccountSystem;

public class Main2 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(101,"Imran",10000,5);

        sa.checkBalance();
        sa.showInterest();
        sa.deposit(2000);
        sa.checkBalance();
        sa.showInterest();

        CurrentAccount ca = new CurrentAccount(102, "Raj", 10000,5000);
        ca.checkBalance();
        ca.withdraw(12000);
        ca.checkBalance();
        ca.deposit(5000);
        ca.withdraw(12000);
        ca.deposit(5000);
        ca.withdraw(12000);
        ca.checkBalance();


    }
}
