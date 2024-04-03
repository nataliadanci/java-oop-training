package exceptions.account;

public class Account {
    private double balance;
    private int iban;

    public Account(int iban) {
        this.iban = iban;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    //throw an exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }
}
