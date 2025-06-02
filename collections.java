import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age ,String name){
        this.age=age;
        this.name= name;

    }
    public String toString(){
        return age + " " +name;
    }
    
    public int compareTo(Student s) {
        return this.age-s.age;
    }
}

public class collections{
    public static void main (String[] args){
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        // list.add(0);
        // list.add(2);
        // Collections.sort(list);
        // System.out.println(list);
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(12, "rahul"));
        list.add(new Student(2, "rohit"));
        list.add(new Student(22, "mohit"));

        Collections.sort(list);
        System.out.println(list);



    }
}