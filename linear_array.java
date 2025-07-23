import java.util.Scanner;

public class linear_array {
    public static void main(String[] args) {
    
     Scanner in = new Scanner(System.in);
     System.out.print("Enter size of array: ");
     int n = in.nextInt();
     int[] arr = new int[n];
     System.out.println("Enter elements:");
     for (int i = 0; i < n; i++) {
         arr[i] = in.nextInt();
     }
     System.out.print("Enter number to search: ");
     int num = in.nextInt();
     boolean found = false;
     for (int val : arr) {
         if (val == num) {
             found = true;
             break;
         }
     }
     if (found)
         System.out.println(num + " is present in the array.");
     else
         System.out.println(num + " is not present in the array.");
 }
 }