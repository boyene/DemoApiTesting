package AccessModifiers2;

public  class Test {
    void m1(){
        System.out.println("form m1");
    }
    class A{
        int a;

        void me1(int a){
          // this.a=a;
            System.out.println("from m1 in A"+a);
        }
    }
    public static void main(String[] args) {
        Test t=new Test();
        t.m1();

    }
}
