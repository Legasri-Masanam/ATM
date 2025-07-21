public class Account{
    private String userName = "yourname";
    private String pin = "12345";
    private double balance = 10000.0;

    public Account(String userName , String pin ,double balance){
        this.userName = userName;
        this.pin = pin;
        this.balance = balance;
    }

    public boolean authenticate(String userName , String pin){
        return this.userName.equals(userName) && this.pin.equals(pin);
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }
    public boolean  withdraw(double amount){
        if(amount <= balance ){
            balance -= amount;
            return true;
        }
        return false;
    }


}
