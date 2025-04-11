import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {

        System.out.println("Enter a number");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int reverse = 0;
            while (n != 0) {
                int remainder = n % 10;
                reverse = (reverse * 10) + remainder;
                n = n / 10;
                }
                System.out.println("The reverse of the number is " + reverse);


            }
        }

