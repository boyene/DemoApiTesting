package project1oops;

public class TestATM {
    public void method1(TransactionType type,User user,double amount){
        if (type == TransactionType.DEPOSIT) {
            user.setBalance(user.getBalance() + amount);
            System.out.println("Deposit successful. New balance: " + user.getBalance());
        }
        else if (type == TransactionType.WITHDRAW) {
            if (user.getBalance() >= amount) {
                user.setBalance(user.getBalance() - amount);
                System.out.println("Withdrawal successful : " + user.getBalance());
            } else {
                System.out.println("Insufficient funds!");
            }
        }
        else if (type == TransactionType.CHECK_BALANCE) {
            System.out.println("Current balance: " + user.getBalance());
        }
        else {
            System.out.println("Invalid transaction type.");
        }
    }


}
