package BankAccountSystem;

public class SavingAccount extends Account{
    private double interestRate;

    public SavingAccount(double accountNumber, String accountHolderName, double balance, double interestRate){
        super(accountNumber, accountHolderName, balance);
        this.interestRate=interestRate;
    }

    public double calculateInterest(){
        return getBalance()*interestRate/100;
    }

    public void showInterest(){
        System.out.println("Interest Amount: "+calculateInterest());
    }

}
