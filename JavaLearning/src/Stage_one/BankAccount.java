package Stage_one;

public class BankAccount {
    private String accountNumber ;
    private double balance;


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        else  {
            System.out.println("Số tiền nạp vào < 0 : Không hợp lệ!");
        }
    }

    public void withdraw(double amount) {
        if (amount < this.balance) {
            this.balance -= amount;
        }
        else{
            System.out.println("Không đủ tiền để rút ");
        }
    }
}
