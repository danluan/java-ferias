package entities;

public class Account {
    private int accountNumber;
    private String username;
    private double balance;

    public Account(int accountNumber, String username, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.username = username;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public String getUsername() {
        return this.username;
    }
    public double getBalance() {
        return this.balance;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void deposit(double depositValue){
        balance += depositValue;
    }

    public void withdraw(double withdrawValue){
        balance -= withdrawValue + 5.0;
    }

    public String toString() {
        return "Account " + getAccountNumber() +
            ", Holder: " + getUsername() +
            ", Balance: R$ " + String.format("%.2f", getBalance()) +
            "\n";
    }

    public void printAccountData(){
        System.out.println("Account data:");
        System.out.print(this);
    }
    


}
