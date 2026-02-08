package accountstatus.bankAccount;

public class BankAccount {

    private int accNo;
    private double balance;
    private int deposit;
    private double withdraw;

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public double getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(double withdraw) {
        this.withdraw = withdraw;
    }

    public double deposit() {
        balance += deposit;
        return balance;
    }

    public double withdraw() {
        if (balance >= withdraw) {
            balance -= withdraw;
        } else {
            System.out.println("Insufficient Amount");
        }
        return balance;
    }

//    public void Deposit() {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }

}
