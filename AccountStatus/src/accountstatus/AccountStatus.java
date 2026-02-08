
package accountstatus;

import accountstatus.bankAccount.BankAccount;


public class AccountStatus {

   
    public static void main(String[] args) {
       
        BankAccount as =new BankAccount();
    
    as.setDeposit(800);
    as.deposit();
        System.out.println(as.getBalance());
        
        as.setWithdraw(500);
        as.withdraw();
        System.out.println(as.getBalance());
        
         as.setWithdraw(300);
        as.withdraw();
        System.out.println(as.getBalance());
        
    }
    
}
