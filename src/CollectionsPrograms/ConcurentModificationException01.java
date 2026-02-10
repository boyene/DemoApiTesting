package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConcurentModificationException01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            //list.add("h");
            list.remove(iterator.next());
            System.out.println(iterator.next());
        }

    }
}
