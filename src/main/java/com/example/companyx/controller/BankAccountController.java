package com.example.companyx.controller;

import com.example.companyx.dao.BankAccountInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RestController
public class BankAccountController {

    private BankAccountInterface bankAccount;
    @Autowired
    public BankAccountController(BankAccountInterface bankAccountInterface) {
        this.bankAccount = bankAccountInterface;
    }

    @GetMapping("/hello")
    public String hello(){
        return "Hello Banker!";
    }

    @PostMapping(path = "/adduser")
    public String insertUser(@RequestBody int Id, String name, String surname){
        return bankAccount.insertUser(Id, name, surname);
    }
    @PostMapping(path ="/deposit")
    public double setDeposit(@RequestBody double deposit){
        return bankAccount.setDeposit(deposit);
    }

    @PostMapping(path = "/withdraw")
    public double setWithdraw(@RequestBody double withdraw){
        return bankAccount.setWithdraw(withdraw);
    }

    @GetMapping(path = "/transaction")
    public void getLastTransaction(){
        bankAccount.getLastTransaction();
    }

    @PutMapping(path = "/bankcharges")
    public void updateAllBalances(){
        bankAccount.updateAllBalances();
    }
}