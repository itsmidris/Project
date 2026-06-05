package BankAccountSystem;

public class Account {
    private double accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(double accountNumber, String accountHolderName, double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName= accountHolderName;
        this.balance=balance;
    }

    public void deposit(double amount){
        balance = balance +amount;

        System.out.println("Amount credited: "+amount);
    }

    public void withdraw(double amount){
        balance= balance- amount;

        System.out.println("Amount debited: "+amount);
    }

    public void checkBalance(){
        System.out.println("Current Balance: "+ balance);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
