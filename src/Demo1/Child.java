package Demo1;

class Parent {
    Parent(String msg) {
        System.out.println("Parent says: " + msg);
    }
}
class Child extends Parent {
    Child() {
        this("Welcome"); }
    Child(String msg) {
        super(msg);
        System.out.println("Child says: " + msg);
    }
    public static void main(String[] args) {
        new Child();
    }
}
