package ua.opnu;

public class BankAccount {
    String name;
    double balance;
    double transactionFee = 0.0;

    public BankAccount(){
        this.name = "";
        this.balance = 0.0;
    }

    public BankAccount(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void changeTransactionFee(double fee){
        if (fee >= 0) transactionFee = fee;
    }

    void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    double getBalance() {
        return this.balance;
    }

    boolean withdraw(double amount) {
        if (amount <= 0) return false;
        if (balance >= amount + transactionFee) {
            balance -= amount + transactionFee;
            return true;
        }
        return false;
    }

    boolean transfer(BankAccount receiver, double amount) {
        if (receiver == null || amount <= 0) return false;
        if (withdraw(amount)) {
            receiver.deposit(amount);
            return true;
        }
        return false;
    }
}