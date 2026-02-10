package MultithreadingPrograms;

public class MyThreadDemo3 implements Runnable{
    public static void main(String[] args) {
        System.out.println("main method started");


        MyThreadDemo3 myThreadDemo3 = new MyThreadDemo3();
        Thread thread=new Thread(myThreadDemo3);
        thread.start();
        for (int a=1;a<=10;a++){
            System.out.println("main method : "+ a);
        }
        System.out.println("main method ended");

    }

    @Override
    public void run() {
        for (int a=1;a<=10;a++){
            System.out.println("run method : "+a);
        }
    }
}
