package com.example.companyx.service;

import com.example.companyx.CompanyxApplication;
import com.example.companyx.dao.BankAccountInterface;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest(classes = CompanyxApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)

public class BankAccountTest {
    @Autowired
    public BankAccountInterface bankAccountInterface;
    @Test
    void setDeposit() {
        double deposit = bankAccountInterface.setDeposit(56.5);
        assertEquals("Deposit", 56.5, deposit);
        bankAccountInterface.getLastTransaction();
    }
    @Test
    void setWithdraw(){
        double withdraw = bankAccountInterface.setWithdraw(56.45);
        assertEquals("Deposit", 56.45, withdraw);
    }

    @Test
    void setInterestRate(){
        assertEquals("Interest ", 2.5, bankAccountInterface.setDeposit(2.5));
    }

    /*@Test
    void updateAllBalances(){
        assertEquals("Interest", bankAccountInterface.setDeposit(50), bankAccountInterface.updateAllBalances());
    }*/


}