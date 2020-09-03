/*

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RestController
public class BankAccountController {
    private final BankAccountInterface bankAccount;
    @Autowired
    public BankAccountController(BankAccountInterface bankAccount){
        this.bankAccount=bankAccount;
    }

    @PostMapping
    public void setDeposit(@RequestBody BankAccount bankAccount){
        bankAccount.setDeposit(bankAccount.setDeposit(500));
    }

    @PostMapping
    public void setWithdraw(@RequestBody BankAccount bankAccount){
        bankAccount.setDeposit(bankAccount.setWithdraw(50));
    }

    @GetMapping
    public void lastTransaction(){

    }
}
*/
