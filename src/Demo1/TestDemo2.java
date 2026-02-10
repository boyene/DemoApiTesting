package Demo1;

public class TestDemo2 {

    public static void main(String[] args) {
        TestDemo2 main = new TestDemo2();
        System.out.println(main.id + " " + main.name);

    }
    int id;
    String name;
    public void TestDemo2(int id, String name) {
        this.id = id;
        this.name = name;
    }
    }

