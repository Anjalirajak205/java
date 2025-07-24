import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Mango");
        list.add("Orange");

        // System.out.println(list);
        // Iterator<String> it = list.iterator();
        // System.out.println(it.hasNext());

        // while (it.hasNext()) {
        //     String data = it.next();
        //     if(data.startsWith("B")){
        //         it.remove();
        //         }
        //         System.out.println(data);
        //         }
        //         System.out.println(list);
        ListIterator<String> it = list.listIterator();
        while (it.hasNext()) {
            String data = it.next();
            System.out.println(data);

            }
            System.out.println("....dhooommmm....");
            while(it.hasPrevious()){
                String Prevdata = it.previous();
                System.out.println(Prevdata);

            }
            }
        }
               


            


        



        


    

