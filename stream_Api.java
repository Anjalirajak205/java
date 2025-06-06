import java.util.*;
import java.util.stream.*;

public class stream_Api {
    public static void main(String[] args) {
        List <Integer> list = Arrays.asList(5,10,15,20,25);
        // int sum = list.stream().reduce(10,(a,b)->a+b);
        // System.out.println(sum);

        //List<Integer>evenList = list.stream()
                                    //.filter(n->n%2==0)
                                    //.map(n-> n+5)
                                    //.collect(Collectors.toList());
        //System.out.println(list);
     int max = list.stream().reduce(0,(a,b)-> a>b?a:b);
     System.out.println(max);
     List <Integer> newlist = list.stream()
                                  .filter(a-> a!=max)
                                  .collect(Collectors.toList());
    int max2 = newlist.stream().reduce(0,(a,b)->a>b?a:b);
    System.out.println(max2);
    }
}
                                    




        
    

