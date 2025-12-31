package _21Exeptions;

public class bankBalance {
    private double balance;

    public bankBalance(double balance){
        this.balance = balance;
    }

    public void withdraw(int amount) throws customException {
        if(amount > balance){
            throw new customException();
        }
        balance -= amount;
    }
}
