import java.util.Scanner;

public class Ascii_value {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        Scanner in = new Scanner(System.in);
        
        char c = in.next().charAt(0);
        int ascii = (int) c ;
        System.out.println("The ASCII value of " + c + " is " + ascii);
        }
        }


    

