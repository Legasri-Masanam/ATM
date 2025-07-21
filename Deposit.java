import java.util.*;
public class Deposit implements Transaction{
    private  Account account;
    private  Scanner sc;

    public Deposit(Account account ,Scanner sc){
        this.account = account;
        this.sc = sc;
    }

    public void perform(){
        System.out.print("Enter deposit amount: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            account.deposit(amount);
            System.out.println("Rupees " + amount + " deposited successfully.");
            System.out.println("Updated Balance: " + account.getBalance());

        } else
            System.out.println("Invalid amount.");

    }
}

