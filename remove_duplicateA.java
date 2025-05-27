import java.util.HashSet;
import java.util.TreeSet;

public class remove_duplicateA {
    public static void main(String[] args) {
        HashSet<String> hset = new HashSet<>();
        hset.add("1");
        hset.add("2");
        hset.add("2");
        hset.add("42");
        hset.add("4");
        hset.add("5");
        hset.add("3");
        hset.add("53");
        hset.add("45");
        hset.add("3");
        hset.add("5");
        System.out.println(hset);

        TreeSet<Integer> tset = new TreeSet<>();
       int [] arr = {1,2,2,42,4,5,3,53,45,3,5};
       int count =0;
       for(int i=0;i<arr.length;i++){
           //printing first repeated array element
         if(tset.contains(arr[i])){
         System.out.println(arr[i]);
         break;
         }
         else
           tset.add(arr[i]);
        }
        //System.out.println(tset);
        //if(tset.contains(arr[i])){
            
            

        }

       }
    


    

