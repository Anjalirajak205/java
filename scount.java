public class scount {
    public static void main(String[] args) {
        String str1="racecarjhgahaha";
        char ch;
        int count=0;
        int consu;
        for(int i=0;i<str1.length();i++){
            ch = str1.charAt(i);
            if(ch=='a'||ch=='e'||ch=='o'||ch=='u'||ch=='i'){
                count++;
            }
        }
        consu=str1.length()-count;
        System.out.println("vowel count: "+count);
        System.out.println("consunant count:"+consu);

        
    }
    
}
