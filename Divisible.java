import java.util.Scanner;

public class Divisible {
    public static void main(String[] args){
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n%5 == 0 && n%11 == 0){
            System.out.println(n + " is divisible by 5 and 11");
        }
        else if(n%5 == 0){
            System.out.println(n + " is divisible by 5 but not divisible by 11");
        }
        else if(n%11 == 0){
            System.out.println(n + " is divisible by 11 but not divisible by 5");
            }
            
        }

    
}
