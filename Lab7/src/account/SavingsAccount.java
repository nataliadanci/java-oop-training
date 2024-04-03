package account;

public class SavingsAccount extends Account{

    private float interest;

    public SavingsAccount(int number, float interest){
        super(number);
        this.interest = interest;
    }

   /* public void addInterest(){
        double result = getBalance() + interest;
        setBalance(result);
    }*/

    public void addInterest(){
        deposit(interest);
    }

    public String toString() {
        return super.toString() + " Interest: " + interest;
    }
}
