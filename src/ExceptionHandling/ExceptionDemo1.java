package ExceptionHandling;


import java.util.HashMap;


public class ExceptionDemo1 {
    static void main() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(null,null);
        map.put(null,null);
        System.out.println(map);



    }
}
