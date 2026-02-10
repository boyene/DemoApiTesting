package Logical;

public class Draw3DDiagram {
    public static void main(String[] args) {
        String[] cube={
                "  +-------+",
                " /       /| ",
                " +------+ |",
                " |      | +",
                " |      |/",
                " +------+"
        };
        for (String line:cube){
            System.out.println(line);
        }
    }
}
