public class string_builder {
    public static void main(String[] args) {

        // String str = "Hello";
        // System.out.println(str.concat("hii"));
        // System.out.println(str);
        
        StringBuilder str=new StringBuilder(15);
        str.append("hello hii byee");
        System.out.println(str.length());
        System.out.println(str.capacity());
 
        
    }
    
}
