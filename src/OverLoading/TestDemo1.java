package OverLoading;

public class TestDemo1 {

    void method1(int a,String name){
        System.out.println(a);
        System.out.println(name);
    }
    void method1(String name,int a){
        System.out.println(a);
        System.out.println(name);
    }
    public static void main(String[] args) {
        TestDemo1 testDemo1 = new TestDemo1();
        testDemo1.method1(10,"hi");
        testDemo1.method1("kl",101);
    }
}
