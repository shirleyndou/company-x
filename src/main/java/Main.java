public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Shirley", "Ndou");
        BankAccount bankAccount = new BankAccount();
        bankAccount.setUser(user);
        System.out.println(bankAccount.getUser().getName());
        bankAccount.setDeposit(500);
        bankAccount.getLastTransaction();
        bankAccount.setWithdraw(50);
        bankAccount.getLastTransaction();
        System.out.println("Current balance = R" + bankAccount.getBalance());
        SavingsAccount savings = new SavingsAccount();
        savings.setInterestRate(10);
        System.out.println("Interest Rate is " + savings.getInterestRate());
        bankAccount.updateAllBalances();
        System.out.println("Current balance = R" + bankAccount.getBalance());

    }
}
