package account;

public class CurrentAccount extends Account{

    private float limit;

    public CurrentAccount(int number, float limit){
        super(number);
        this.limit = limit;
    }

    public void checkOverdraftLimit(float sum){
        if(sum > limit){
            System.out.println("Overdraft limit exceeded");
        }
        else{
            withdraw(sum);
        }
    }

    public String toString() {
        return super.toString() + " Limit: " + limit;
    }


}
