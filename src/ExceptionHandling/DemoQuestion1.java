package ExceptionHandling;

public class DemoQuestion1 implements Runnable{
    static void main() throws InterruptedException {
        Thread t = new Thread(new DemoQuestion1());
        t.start();

        System.out.print("A");
        t.join();
        System.out.print("B");
    }

    @Override
    public void run() {
        System.out.print("C");
    }
}
