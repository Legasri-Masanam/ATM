import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Account account = new Account("yourname", "12345", 10000.0);
        System.out.print("Enter Your Username: ");
        String username = sc.next();

        System.out.print("Enter Your Passcode: ");
        String pin = sc.next();
        if (account.authenticate(username, pin)) {
            System.out.println("\n===== ATM Login Successful =====");

            while (true) {
                System.out.println("\n===== ATM Menu =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Change PIN");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                Transaction transaction = null;

                switch (choice) {
                    case 1:
                        transaction = new Checkbalance(account);
                        break;
                    case 2:
                        transaction = new Deposit(account, sc);
                        break;
                    case 3:
                        transaction = new Withdraw(account, sc);
                        break;
                    case 4:
                        System.out.println("Thank you for using ATM. Visit again!");
                        return;
                    default:
                        System.out.println("Invalid choice.");
                        continue;
                }

                transaction.perform();
            }

        } else {
            System.out.println("Invalid Username or Password. Access Denied.");
        }



    }
}
