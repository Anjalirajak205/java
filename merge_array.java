public class merge_array {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2,4};
        int[] merged = new int[arr1.length + arr2.length];
        
        for(int i=0;i<arr1.length;i++){
            merged[i] = arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            merged[arr1.length + i] = arr2[i];
        }
         for(int i=0;i<merged.length;i++){
            System.out.print(merged[i] + " ");
            } 
          /*  System.out.println("merged array:");
           for(int val : merged){
            System.out.print(val + " ");
            }*/

            }
            }
            