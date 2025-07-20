import  java.util.Scanner;
public class ExceptionHandling {
    public static void main(String[] args) {
       // int a = 10;
       // int b = 0;
        Scanner in = new Scanner(System.in);
       /*System.out.println("enter numbers:");
       int a=in.nextInt();
       int b=in.nextInt();

        try{
            int c = a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("we cannot divide by zero");


        }
        System.out.println("hello");*/
           System.out.println("enter the size of array");
            int n = in.nextInt();
            int [] arr = new int[n];
            System.out.println("enter the elements of array:");
            for(int i=0;i<arr.length;i++){
                arr[i]=in.nextInt();
            }
            try{
                System.out.println("enter the valuee for access:");
                int i= in.nextInt();
                System.out.println(arr[i]);
            }
            catch(Exception e ){
                System.out.println("we cannot access the elemtent");

            }
            finally{
                System.out.println("sab kuch thik hai");
            }
        }
    }
    
    

