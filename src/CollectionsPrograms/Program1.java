package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Program1 {
    static void main() {
        Map<String,String> map=new HashMap<>();
        map.put("Krishna","Yella");
        map.put("Ravi","Teja");
        map.put("Pavan","Kalyan");
        map.put("Mahesh","Babu");
        map.put("Allu","Arjun");
        map.entrySet().stream().forEach(e->System.out.println(e.getKey()+" -> "+e.getValue()));

//        Set<Map.Entry<String, String>> k=map.entrySet();
//        for(Map.Entry<String,String> m:k){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    }
}
