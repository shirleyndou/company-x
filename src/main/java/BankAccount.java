public class BankAccount {
    private int idNumber;
    private String name, surname;

    double balance=0;
    int lastTransaction;
    private double interestRate;
    private double bankCharges = 5;

    public BankAccount(int id, String name, String surname){
        this.idNumber = id;
        this.name=name;
        this.surname=surname;
    }

    public void setDeposit(int deposited){
        if(deposited !=0){
            balance += deposited;
            lastTransaction = deposited;
        }
    }

    public void setWithdraw(int withdraw){
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

    public void setInterestRate(int interestRate) {
        if(interestRate >= 0 && interestRate <= 50) {
            this.interestRate = interestRate;
        }else{
            System.out.println("Interest Rate must be between 0 & 50%");
        }
    }
    public double getInterestRate(){
        return interestRate;
 }

 public void updateAllBalances(){
        balance = balance - bankCharges;
 }
   /* public void setInterestRate(){
        int interest = (balance * interestRate * 1)/100;
    }*/

    public String toString(){

        return "Account holder ID: " + this.idNumber + "\nAccount holder name: " + this.name + "\nAccount holder surname: " +this.surname;
    }
}
