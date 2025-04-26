public class asmallest {
    static int small(){
        int[] arr = {10,60,4,90};
        int small= arr[0];
        for(int i = 0;i<arr.length;i++){
            if(small>arr[i]){
                small=arr[i];
            }
        }

        return small;
    }

    public static void main(String[] args){
        System.out.println(small());
    }
    
}
