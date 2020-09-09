import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("api/user")
@RestController
public class BankAccountController {
    @Autowired
    private BankAccountInterface bankAccountInterface;

    @PostMapping(path ="deposit")
    public double setDeposit(@RequestBody double deposit){
        return bankAccountInterface.setDeposit(deposit);
    }

    @PostMapping(path = "withdraw")
    public double setWithdraw(@RequestBody double withdraw){
        return bankAccountInterface.setWithdraw(withdraw);
    }

    @GetMapping(path = "transaction")
    public void getLastTransaction(){
        bankAccountInterface.getLastTransaction();
    }

    @PutMapping(path = "bankcharges")
    public void updateAllBalances(){
        bankAccountInterface.updateAllBalances();
    }
}
