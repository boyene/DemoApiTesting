package Constructor;
/*
    Constructor Chaining
 */
public class TestDemo1 {

    public TestDemo1(){
        System.out.println("No Arg Called");
    }
    //Constructor Overloading
    //One Arg
    public TestDemo1(int a){
        this();
        System.out.println("One Arg Called"+a);
    }
    //Two Arg
    public TestDemo1(int a,float b){
        this(100 );
        System.out.println("Two Arg Called"+a+" "+b);
        System.out.println(a*b);
    }
    public static void main(String[] args){

        TestDemo1 t1=new TestDemo1(10,20F);

    }
}
