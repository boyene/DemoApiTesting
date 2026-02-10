package project1oops;

public class User {
    private String name;
    private String AccountNumber;
    private int pin;
    private double balance;

    public User() {
    }

    public User(String name, String accountNumber, int pin, double balance) {
        this.name = name;
        AccountNumber = accountNumber;
        this.pin = pin;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        AccountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User Details:" +
                "\nName: " + name +
                "\nAccount Number: " + AccountNumber +
                "\nBalance: " + balance;
    }
}
