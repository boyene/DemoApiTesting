package ForLoop;

public class ForLoopDemo2 {
    public static void main(String[] args) {

                for (int i = 0, j = 10; i < j; i++, j--) {
                    System.out.println("i = " + i + ", j = " + j);
                }
        for (int i = 0; i < 5; System.out.println("i: " + i++));
        for (;;) {
            System.out.println("This will run once and break.");
            break;
        }



    }
}
