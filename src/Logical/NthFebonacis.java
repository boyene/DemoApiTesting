package Logical;

public class NthFebonacis {
    public static void main(String[] args) {
        int n=5;
        int a=0;
        int b=1;
        for (int i = 1; i <=n ; i++) {
            int febonacis=a+b;
                a=b;
                b=febonacis;

        }
        System.out.println(b);

    }
}
