package account;

public class Bank {

    private Account[] accounts;
    private int nrAccounts;
    private static final int MAX_ACCOUNT_NUMBER = 10;

    public Bank(){
        accounts = new Account[MAX_ACCOUNT_NUMBER];
        nrAccounts = 0;
    }

    public void openAccount(Account account){
        accounts[nrAccounts] = account;
        nrAccounts++;
    }
// noi nu am sters un element ci l-am setat la null
  /*  public void closeAccount(int number){
        for(int i=0;i<MAX_ACCOUNT_NUMBER;i++){
            if(accounts[i]!=null){
                if(accounts[i].getAccountNumber()==number){
                    accounts[i] = null;
                }
            }
        }
    }*/

    public void closeAccount(int number){
        int indexFound = 0;
        for(int i=0;i<nrAccounts;i++){
            if(accounts[i].getAccountNumber()==number){
                    indexFound = i;
            }
        }
        for(int i = indexFound; i < nrAccounts-1; i++){
            accounts[i] = accounts[i+1];
            //accounts[i+1] = accounts[i+2]; //se face siftarea elementelor
        }
        nrAccounts--;
    }

    public void processAllAccounts(){
        for(int i=0;i<MAX_ACCOUNT_NUMBER;i++) {
            if (accounts[i] != null) {
                if (accounts[i] instanceof SavingsAccount) {
                    ((SavingsAccount) accounts[i]).addInterest();
                }
                if (accounts[i] instanceof CurrentAccount) {
                    ((CurrentAccount) accounts[i]).checkOverdraftLimit(50);
                }
            }
        }
    }

    public void payDividendAllAccounts(double dividend){
        for(int i = 0;i < MAX_ACCOUNT_NUMBER;i++) {
            if (accounts[i] != null) {
                accounts[i].deposit(dividend);
            }
        }
    }

    public void printBankAccounts(){
        for(int i=0; i < nrAccounts; i++){
            System.out.println(accounts[i]);
        }
    }
}
