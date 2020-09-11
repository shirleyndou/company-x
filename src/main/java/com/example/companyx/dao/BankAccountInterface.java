package com.example.companyx.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountInterface {
    double setDeposit(double deposited);
    double setWithdraw(double withdraw);
    void getLastTransaction();
    Object updateAllBalances();
    void setInterestRate(double interestRate);
    String insertUser(int Id, String name, String surname);
}
