public class SavingsAccount extends BankAccount{

    private double interestRate;
    BankAccount bankAccountInterface;
    public SavingsAccount(BankAccountInterface bankAccount) {
        super(bankAccount);
    }
    public SavingsAccount(){}

    public void setInterestRate(double interestRate) {
        if(interestRate >= 0 && interestRate <= 50) {
            this.interestRate = interestRate;
        }else{
            System.out.println("Interest Rate must be between 0 & 50%");
        }
    }
  /*  public void setInterestRate(double interestRates) {
      interestRates = (bankAccountInterface.getBalance() * interestRate * 2) / 100;
          this.interestRate=interestRates;
    }*/
    public double getInterestRate(){
        return interestRate;
    }
}
