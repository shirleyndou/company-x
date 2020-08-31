public interface BankAccountInterface {
    void setDeposit(int deposited);
    void setWithdraw(int withdraw);
    void getLastTransaction();
    void setInterestRate(int interestRate);
    double getInterestRate();
    void updateAllBalances();
}
