package ATMSystem;

public class ATM {
    private String accountHolderName;
    private double balance;

    public ATM(String accountHolderName, double balance){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }

    public void checkBalance(){
        System.out.println("Current Balance: Rs."+ balance);
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Money Deposited: " + amount);
    }

    public void withdraw(double amount){

        if (amount <= balance){
            balance =balance -amount;
            System.out.println("Money Withdraw: " + amount);
        }else {
            System.out.println("Insufficient balance! Please check your balance");
        }
    }
}
