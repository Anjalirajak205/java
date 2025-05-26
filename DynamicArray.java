import java.util.ArrayList;
import java.util.Collections;

public class DynamicArray {

    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Rohit");
        arr.add("rohit");
        arr.add("mohit");
        arr.add(0,"jain");
        System.out.println(arr);
        System.out.println(arr.get(1));
        System.out.println(arr.size());
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        arr.set(3, "sneha");
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        System.out.println(arr.reversed());
        // arr.add("a");
        //arr.add("c");
        // arr.add("b");
        // Collections.sort(arr);
        // System.out.println(arr);



       for(String str:arr){
            System.out.println(str);
       }
      }
    }
    


        // dynamic subarray summ...
        
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     arr.add(2);
    //     arr.add(-7);
    //     arr.add(0);
    //     arr.add(5);
    //     arr.add(6);
    //     arr.add(-3);
    //     arr.add(0);
    //     arr.add(1);
    //   System.out.println(arr);
    //   System.out.println( arr.subList(0, 8));
    //   int sum=0;

    //   for(int i=0;i<arr.size();i++){
    //     sum+=arr.get(i);
    //     }
    //     System.out.println(sum);
    //   }
    // }

       