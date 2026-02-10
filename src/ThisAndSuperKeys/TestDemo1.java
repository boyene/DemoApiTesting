package ThisAndSuperKeys;

public class TestDemo1 {
    public static void main(String [] args){
        Cat cat=new Cat(4);
    }
}
class Animal{
        Animal(){
            System.out.println("Hello Animal Constructor called !!!!!!!!!");
        }
}
class Cat extends Animal{
    Cat(){
        System.out.println("Cat Constructor Called !!!!!!!!!!!!!");
    }
    Cat(int legs){
       // this();
        super();
        System.out.println("How many legs that Cat having : "+legs);
    }

}