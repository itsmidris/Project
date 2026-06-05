package BankAccountSystem;

public class CurrentAccount extends Account{

    private double overdraftLimit;

    public CurrentAccount(double accountNumber, String accountHolderName, double balance, double overdraftLimit){
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit=overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if(amount<= getBalance()+overdraftLimit){
            setBalance(getBalance()-amount);
            System.out.println("Amount Debited: "+ amount);
        }
        else {
            System.out.println("Overdraft Limit Exceeded");
        }
    }
}
