package project1oops;

public class MainClass {
    public static void main(String[] args) {
        User user=new User();
        TestATM testATM=new TestATM();
        testATM.method1(TransactionType.DEPOSIT,user,7000.00);
        testATM.method1(TransactionType.WITHDRAW,user,5000.00);
        testATM.method1(TransactionType.CHECK_BALANCE, user, 0);
    }
}
