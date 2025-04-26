public class methods {
    
    //  void sum(){      //non static for static we use the static keyword
    //     System.out.println("hellloooo");


    // }

    // public static void main(String[] args) {
    //     methods obj = new methods();
    //     obj.sum();
    //     //sum();
        
   // }
      
//       static void sum (int a,int b){
//         System.out.println(a+b);
//       }

//      public static void main(String[] args) {
        
//             //     methods obj = new methods();
//             //     obj.sum();
    
//             sum(6, 7);
        
//      }
    static int sum(int a, int b){

        return a+b;
    }
    static int sub(int a, int b){

        return a-b;
    }

    public static void main(String[] args){
       // int output=sum(6, 10);
      // int output=sub(8,6);
      // System.out.println(output);
       
    sum(6, 10);
    sub(8,6);

    System.out.println(sum(6,10));
    System.out.println(sub(8,6));
    }
    
 }    


    

