public class SavingsAccount extends BankAccount{

    private double interestRate;
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
}
