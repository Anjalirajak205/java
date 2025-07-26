public class maximum_array {
    public static void main(String[] args) {
        int[] arr1 = {5,41,6,23};
        int[] arr2 = {7,4,5,9};
         
        int max = Integer.MIN_VALUE;

        for( int i=0;i<arr1.length;i++){
            if(arr1[i]>max){
                max = arr1[i];

            }

    }
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>max){
                max = arr2[i];
                }
        }
        System.out.println("maximum element is:"+max);
    
}
}