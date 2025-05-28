import java.util.HashMap;
public class frequency {
    public static void main(String[] args) {
    //     String str = "prograaming"; 
    //     HashMap<Character,Integer> map = new HashMap<>();
    //     char[]  ch = str.toCharArray();
    //    for(char i : ch){
    //     map.put(i, map.getOrDefault(i, 0)+1);
    //     }
    //     System.out.println(map);
    //       String str1 = "prograaming is a fun and fun is a prograaming";
    //       String[] words = str1.split(" ");
    //       HashMap<String,Integer> map = new HashMap<>();
    //       for(String i : words){
    //         map.put(i, map.getOrDefault(i, 0)+1);

    //    }
    //    System.out.println(map);

    // printing first non repeating character
       String str = "aaabcccdddeeef";
       HashMap<Character,Integer> map = new HashMap<>();
       for(char ch : str.toCharArray()){
        map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        for(char i: map.keySet()){
            if(map.get(i)==1){
                System.out.println(i);
                break;

        }
        
        }
    }
}
        
             
                 
        

            


       
      
        
    

       


       

    



        

            

        



    

