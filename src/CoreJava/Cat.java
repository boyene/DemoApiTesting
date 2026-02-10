package CoreJava;

public class Cat implements Animall{
    public static void main(String [] args){
        System.out.println("Hello Cat");
    }
    @Override
    public void hunting(){
        System.out.println("Cat hunting the rat");
    }

    public String sound() {
        return "Myawow";
    }

    public String Walking() {
        return "Fast";
    }

    public void method1() {

    }

    public void method2() {

    }
}
