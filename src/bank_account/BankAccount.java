package bank_account;

public class BankAccount {
    private String accountID;
    private double balance;

    public BankAccount(String accountID,double balance){
        this.accountID =accountID;
        this.balance = balance;
    }

    public String getAccountID() {
        return accountID;
    }
    public void setAccountID(String accountID){
        this.accountID =accountID;
    }
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " TL yatırıldı. Yeni bakiye: " + balance);
        } else {
            System.out.println("Yatırılacak miktar sıfırdan büyük olmalı!");
        }
    }
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println(amount + " TL çekildi. Yeni bakiye: " + balance);
        } else {
            System.out.println("Yetersiz bakiye!");
        }
    }
    public void accountDetails(){
        System.out.println("Account ID is: "+accountID + "balance :"+balance);
    }


}
