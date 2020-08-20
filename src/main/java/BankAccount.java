public class BankAccount {
    private int idNumber;
    private String name, surname;

    int balance=0;
    int lastTransaction;

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
            System.out.println("Deposited " + lastTransaction);
        }else if(lastTransaction <0){
            System.out.println("Withdrew " + Math.abs(lastTransaction)); //abs- so it returns a positive value
        }else{
            System.out.println("No transaction occurred");
        }
    }

    public String toString(){

        return "Account holder ID: " + this.idNumber + "\nAccount holder name: " + this.name + "\nAccount holder surname: " +this.surname;
    }
}
