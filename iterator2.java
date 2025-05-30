import java.util.ArrayList;
import java.util.ListIterator;

public class iterator2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");

        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String data = it.next();
            if(data.length()<= 5){
                data = "bye";

            }
            System.out.println(data);
        }
        System.out.println("..yoooooo..");
        int count =0;
        while(it.hasPrevious()){
             String data = it.previous();
             count++;
           // System.out.println(it.previous());
            if( count != list.size()){
               data ="hello";
               //it.set("hello");
             }
             System.out.println(data);
            //System.out.println(list.size());
            }
           // System.out.println(list);
        
        String str = "Cherry";
        int count1=0;
        while(it.hasNext()){
            String data=it.next();
            count1++;
            if(data == str){
                System.out.println(count1 - 1);
        }
    }
}
}

            
            

        
        
    






    
    

