import java.util.ArrayList;

public class Dynamic_Array2 {
   // public class tryCatch{
        public static void main(String[] args) {
            try{
            ArrayList<Integer>arr = new ArrayList<>();
            //adding elements dynamically
        arr.add(2);
        arr.add(-7);
        arr.add(0);
        arr.add(5);
        arr.add(6);
        arr.add(-3);
        arr.add(0);
        arr.add(1);

        int sum ,max =arr.get(0),a=0;
        for(int i=0;i<arr.size()-2;i++){
            sum = arr.get(i)+arr.get(i+1)+arr.get(i+2);
            if(sum>max){
                max = sum;
                a=i;
                }
                }
                System.out.println("the sum is :" + max);
                System.out.println("the subarray consist of elements:"+arr.get(a)+" " +arr.get(a+1)+" "+arr.get(a+2));
            }
            catch(Exception e){
                System.out.println("max subarray sum is not found");
            }

            }
        }

        
            
            

        

    
            
        
    


    

