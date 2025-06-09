import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamAPI_Questions {
    public static void ques1() {

        //question 1 : return a list of squares of only even numbers.
        List <Integer> list = Arrays.asList(1,2,3,4,5);
        List<Integer>evenList = list.stream()
                                    .filter(n->n%2==0)
                                    .map(n-> n*n)
                                    .collect(Collectors.toList());
                                    System.out.println(evenList);
    }

    public static void ques2() {
        //question 2 : return a list of names in uppercase which have more than 3 characters
        List <String> list = Arrays.asList("Ram","Shyam","Om","Sita");
        List<String> newList=list.stream()
                                 .filter(n->n.length()>3)
                                 .map(n->n.toUpperCase())
                                 .collect(Collectors.toList());
          
          System.out.println(newList);
    }
    public static void ques3() {
        //question 3 : find the sum of all numbers in a list 
         List <Integer> list = Arrays.asList(1,2,3,4,5);
         List<Integer> oddList=list.stream()
                                   .filter(n->n%2!=0)
                                   .collect(Collectors.toList());
                                   int sum=oddList.stream().reduce(0,(a,b)->a+b);
                                   System.out.println(sum);
    }
      public static void ques4() {

        //question 4 : convert a list of words to their lengths
        List<String> words = Arrays.asList("Java","Stream","API");
        List<Integer> lengths = words.stream()
                                     .map(n->n.length())
                                     .collect(Collectors.toList());
        System.out.println(lengths);
      }
      public static void ques5() {
        //question 5 : from a list of prices ,remove duplicates,filter prices above 1000,and return total sum.
        List<Integer> prices= Arrays.asList(999,1000,1500,1000,2000);
        List<Integer> uniqueList=prices.stream()
                                       .distinct()
                                       .filter(n->n>1000)
                                       .collect(Collectors.toList());
                                       int sum=uniqueList.stream()
                                                         .reduce(0,(a,b)->a+b);
                                                         System.out.println(sum);
      }
      public static void ques6() {
        //question 6 : count how many Strings in a list start with letter "A" or "a".
        List<String> words = Arrays.asList("apple","banana","apricot","cherry","Avocado");
        long count = words.stream()
                          .filter(n->n.startsWith("A")|| n.startsWith("a"))
                          .count();
                          System.out.println(count);
      }
      public static void ques7() {
        //question 7 : return a comma separated string of all names with more than 4 letters.
        List<String> names = Arrays.asList("John","Ravi","Abhishek","Raj");
        String result = names.stream()
                             .filter(n->n.length()>4)
                             .collect(Collectors.joining (","));
                             System.out.println(result);
      }
      public static void ques8() {
        //question 8 : check if any number in a list is divisible by 7.
        List<Integer> numbers = Arrays.asList(10,14,22,30);
        boolean result = numbers.stream()
                            .anyMatch(n->n%7==0);
                            System.out.println(result);
      } 
      public static void ques9() {
        //question 9 : multiply all numbers in a list using reduce().
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        int result = numbers.stream()
                            .reduce(1,(a,b)->a*b);
                            System.out.println(result);
      }
      public static void ques10() {
        //question 10 : from a list of sentences ,return a list of words(flat list)
        List<String> sentences = Arrays.asList("Java is fun","Streams are powerful");
        List<String> words = sentences.stream()
                                      .flatMap(mapper->Arrays.stream(mapper.split(" ")))
                                      .collect(Collectors.toList());
                                      System.out.println(words);
      }

    public static void main(String[] args) {
    ques1();
    ques2();
    ques3();
    ques4();
    ques5();
    ques6();
    ques7();
    ques8();
    ques9();
    ques10();
}
    }
