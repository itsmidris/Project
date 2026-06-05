package ATMSystem;

public class Main {

    public static void main(String[] args) {
        ATM atm = new ATM("Imran", 10000);

        atm.checkBalance();

        atm.deposit(2000);

        atm.checkBalance();

        atm.withdraw(5000);

        atm.checkBalance();
    }

}
