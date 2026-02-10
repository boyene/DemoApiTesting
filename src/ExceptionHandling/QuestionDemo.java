package ExceptionHandling;
class PrintA{
    public void printMe(){
        System.out.println("MeA");
    }
}
class PrintB extends PrintA{

    public void printMeB() {
        System.out.println("MeB");
    }
}
class  PrintC extends PrintA{

    public void printMeC() {
        System.out.println("MeC");
    }
}
public class QuestionDemo {
    static void main() {
        PrintB testB=new PrintB();
        PrintC testC=new PrintC();
        newPrint(testB);
        newPrint(testC);
    }
    static void newPrint(PrintA printA){
        printA.printMe();
    }
}
