import java.util.Scanner;

public class Withdraw implements Transaction{
    private Account account;
    private Scanner sc;

    public Withdraw(Account account, Scanner sc) {
        this.account = account;
        this.sc = sc;
    }

    public void perform(){
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        if (amount > 0) {
            if (account.withdraw(amount)){
                System.out.println("Rupees " + amount + " withdrawn successfully.");
                System.out.println("Updated Balance: " + account.getBalance());
            }else
                System.out.println("Insufficient balance.");

        } else
            System.out.println("Invalid amount.");

    }
}
