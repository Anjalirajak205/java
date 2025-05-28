import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String,Integer> map = new HashMap<>();
        map.put("id0", 1);
        map.put("id1", 2);
        map.put("id2",3);
        System.out.println(map);
        System.out.println(map.get("id0"));
        System.out.println(map.containsKey("id0"));
        System.out.println(map.containsValue(2));
        map.remove("id0");
        System.out.println(map);

        for(String key : map.keySet()){
            System.out.println(key);
        }
        // HashMap<Integer,Integer> map = new HashMap<>();
        // map.put(1, 10);
        // map.put(2,  12);
        // map.put(3,15);
        // for(int key : map.keySet()){
        //     System.out.println(key);
        //      }


        //     map.forEach((key,value) -> {
        //         // if(key>2){
        //         // System.out.println(key+" "+value);
        //         // }
        //         if(value.equals(12)){
        //             System.out.println(value);
        //         }
        //     });
             System.out.println(map.getOrDefault("id", 0));

        }
        }
