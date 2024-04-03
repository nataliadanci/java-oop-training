package account;

public class BankDemo {
    public static void main(String[] args) {
        Account account1 = new Account(76);
        SavingsAccount savingsAccount1 = new SavingsAccount(25, 100);
        CurrentAccount currentAccount1 = new CurrentAccount(43, 130);
        Account account2 = new Account(132);
        SavingsAccount savingsAccount2 = new SavingsAccount(68, 80);
        CurrentAccount currentAccount2 = new CurrentAccount(12, 20);

        Bank bank = new Bank();

        bank.openAccount(account1);
        bank.openAccount(savingsAccount1);
        bank.openAccount(currentAccount1);
        bank.openAccount(account2);
        bank.openAccount(savingsAccount2);
        bank.openAccount(currentAccount2);

        bank.payDividendAllAccounts(100);
        System.out.println("Display accounts after dividend paid: ");
        bank.printBankAccounts();
        System.out.println();
        bank.processAllAccounts();
        System.out.println("Display accounts after processing: ");
        bank.printBankAccounts();
        System.out.println();
        System.out.println("Close an account: ");
        bank.closeAccount(132);
        bank.printBankAccounts();
    }
}
