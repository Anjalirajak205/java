public class string_palindrom {
    public static void main(String[] args) {
        String palindrom = "racecar";
        String reverse="";
       
        for(int i=palindrom.length()-1;i>=0;i--){
            reverse += palindrom.charAt(i);
        }

        if(reverse.equals(palindrom)){
            System.out.println("It is a palindrome.");}

            else
            System.out.println("not a palindrome");
        }



        
    }
    

