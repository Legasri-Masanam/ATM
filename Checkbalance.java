

public class Checkbalance implements Transaction {
    private Account account;

    public Checkbalance(Account account){
        this.account = account;
    }

    public void perform(){
        System.out.println("Balance Amount: " + account.getBalance());
    }


}
