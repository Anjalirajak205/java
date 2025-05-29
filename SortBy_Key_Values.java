import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.ArrayList;

public class SortBy_Key_Values {
    public static void main(String[] args) {
        // sorted by keys 
        // Map<String, Integer> map = new HashMap<>();
        // map.put("Banana", 10);
        // map.put("Apple", 30);
        // map.put("Cherry", 20);

        
        // Map<String, Integer> treeMap = new TreeMap<>(map);

        // System.out.println("Sorted by Keys: " + treeMap);

        // sorted by values
        Map<String,Integer> map = new HashMap<>();
        map.put("Banana", 10);
        map.put("Apple", 30);
        map.put("Cherry", 20);

        List<Map.Entry<String , Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println("Sorted by values:");
        for (Map.Entry<String ,Integer> entry : list){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
            









        
    




