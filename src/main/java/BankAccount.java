public class BankAccount implements BankAccountInterface{

    private double balance=0;
    private double lastTransaction;
    private long ID;
    private static final double BANK_CHARGES = 5;
    private User user;

    public BankAccount(){}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //checks if a user deposited money and tracks the last last transaction
    public void setDeposit(double deposited){
        if(deposited !=0){
            balance += deposited;
            lastTransaction = deposited;
        }
    }
    //checks if a user withdrew money and tracks the last last transaction
    public void setWithdraw(double withdraw){
        if(withdraw !=0){
            balance -= withdraw;
            lastTransaction= -withdraw;
        }
    }

    public void getLastTransaction(){
        if(lastTransaction > 0){
            System.out.println("Deposited = R" + lastTransaction);
        }else if(lastTransaction <0){
            System.out.println("Withdrew = R" + Math.abs(lastTransaction)); //abs- so it returns a positive value
        }else{
            System.out.println("No transaction occurred");
        }
    }

    public double getBalance(){
        return balance;
    }

 public void updateAllBalances(){
        balance = balance - BANK_CHARGES;
 }

}
