

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
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
        savings.setInterestRate(2.6);
        System.out.println("Interest Rate is " + savings.getInterestRate());
        bankAccount.updateAllBalances();
        System.out.println("Current balance = R" + bankAccount.getBalance());
    }

}