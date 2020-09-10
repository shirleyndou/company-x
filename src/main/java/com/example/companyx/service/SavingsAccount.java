package com.example.companyx.service;

import com.example.companyx.dao.BankAccountInterface;

public class SavingsAccount extends BankAccount{
    private double interestRate=2.6;
    BankAccount bankAccountInterface = new BankAccount();
    public SavingsAccount(BankAccountInterface bankAccount) {
        super(bankAccount);
    }
    public SavingsAccount(){}

    @Override
    public void setInterestRate(double interestRates) {
        interestRates = (bankAccountInterface.setDeposit(500) * interestRate * 3) / 100;
        this.interestRate=interestRates;
    }
    public double getInterestRate(){
        return interestRate;
    }
}
