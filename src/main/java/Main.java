public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1, "Shirley", "Ndou");
        System.out.println(bankAccount.toString());
        bankAccount.setDeposit(500);
        bankAccount.getLastTransaction();
        bankAccount.setWithdraw(50);
        bankAccount.getLastTransaction();
        System.out.println("Current balance = " + bankAccount.getBalance());
        bankAccount.setInterestRate(10);
        System.out.println("Interest Rate is " + bankAccount.getInterestRate());
        bankAccount.updateAllBalances();
        System.out.println("Current balance = R" + bankAccount.getBalance());

    }
}
