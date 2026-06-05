public class ATM {

    // Private variables (Data Hiding)
    private String accountHolderName;
    private double balance;

    // Constructor
    ATM(String name, double bal) {
        this.accountHolderName = name;
        this.balance = bal;
    }

    // Getter method
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        }
    }

    // Display account details
    public void showBalance() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }

    public static void main(String[] args) {

        // Creating ATM object
        ATM atm = new ATM("Raj", 10000);

        // Display initial balance
        atm.showBalance();

        System.out.println();

        // Deposit money
        atm.deposit(5000);

        // Withdraw money
        atm.withdraw(2000);

        System.out.println();

        // Display updated balance
        atm.showBalance();
    }
}