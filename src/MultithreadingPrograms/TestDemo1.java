package MultithreadingPrograms;

public class TestDemo1 extends Thread {
    public static void main(String[] args) {
        System.out.println("Main thread started !!");

        TestDemo1 testDemo1 = new TestDemo1();
        testDemo1.setName("MyThread");//To Set Custom thread Name setName() -> Method From Thread Class
        testDemo1.start();


        for (int i = 1; i <= 10; i++) {
            System.out.println("Inside main thread: " + i);
        }

        System.out.println("Main thread ended !!");
        System.out.println("Thread Name is : "+Thread.currentThread().getName());
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Inside run thread: " + i);
        }

        System.out.println("Thread Name is : "+Thread.currentThread().getName());//Thread Name is : MyThread

    }
}
