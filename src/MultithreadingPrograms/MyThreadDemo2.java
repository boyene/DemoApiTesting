package MultithreadingPrograms;

public class MyThreadDemo2 {
    public static void main(String[] args) {
        System.out.println("main Thread Started");

        Spotify spotify=new Spotify();
        spotify.start();

        Song song = new Song();
        song.start();

        Timer timer = new Timer();
        timer.start();

        System.out.println("main Method Ended !!");
        System.out.println("Thread Name : "+Thread.currentThread().getName());
    }

}
// multiple methods
class Spotify extends Thread{
    public void run(){
        for (int a = 1;a <= 10;a++){
            System.out.println("From Spotify "+a);
        }
    }
}
class Song extends Thread{
    @Override
    public void run() {
        for (int a = 1;a <= 10;a++){
            System.out.println("From Song "+ a);
        }
    }
}
class Timer extends Thread{
    @Override
   public void run() {
        for (int a = 1;a <= 10;a++){
            System.out.println("From Timer "+a);
        }

    }
}