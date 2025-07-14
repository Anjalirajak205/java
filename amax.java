import java.util.Scanner;

public class amax {
    public static void main(String[] args) { //taking input from user
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter a value of array");
        for(int i =0;i<n;i++){
            arr[i]=in.nextInt();
        }
            // for(int k=0;k<arr.length;k++){
            //     System.out.println(arr[k]);
            // }
         int max =0;
         int sum =0;
         for(int j=0;j<n;j++){
            sum=sum+arr[j];
            if(arr[j]>max){
                max=arr[j];
                }
         }  
         System.out.println("max elements:") ;
         System.out.println(max);
         System.out.println("sum :"+sum);


    
}
}
