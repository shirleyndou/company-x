package com.example.companyx.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface BankAccountInterface {
    double setDeposit(double deposited);
    double setWithdraw(double withdraw);
    void getLastTransaction();
    void updateAllBalances();
    void setInterestRate(double interestRate);
}
