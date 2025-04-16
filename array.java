import java.util.Scanner;

public class array {

    public static void main(String[] args) { //taking input from user
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("enter a value of array");
        for(int i =0;i<n;i++){
            arr[i]=in.nextInt();
        }
            for(int k=0;k<arr.length;k++){
                System.out.println(arr[k]);
            }
             for(int j=arr.length-1;j>=0;j--){ // reverse
                 System.out.println(arr[j]);
            }

        }
    }

       // int[] arr={1,2,3,4,5,6};
       // for(int i=0;i<arr.length;i++){
        //    System.out.println(arr[i]);
       // }



    


