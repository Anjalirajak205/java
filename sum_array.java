public class sum_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int [] sum = new int[arr1.length];
       // int sum1 = 0;
       // int sum2 = 0;

       /*  for(int i=0;i<5;i++){
            sum1 = sum1 + arr1[i];
            sum2 = sum2 + arr2[i];

        }
         int sum = sum1+sum2;
         System.out.println("sum:"+sum);
        }*/
         for(int i =0;i<arr1.length;i++){
            sum[i] = arr1[i]+arr2[i];

         }
         
            System.out.println("sum :");
            for(int i =0;i<arr1.length;i++){
                System.out.println(sum[i]);
               
            }

        
}
}
