public class Smax_repeated {
    public static void main(String[] args) {
        String str = "ffffghhk";
        
        char[] arr= str.toCharArray();
        
        int  maxcount = 0;
        char maxvalue = '0';
        for(int i =0; i<arr.length;i++){
            int count = 0;
            char c = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if(arr[j]==c){
                    count++;

                }

        }
           if(count>maxcount){
            maxcount = count; maxvalue = c;
           }    
           }
            System.out.println("Character: " + maxvalue + ", Count: " + maxcount);     


                    



        }
        
    }
    

