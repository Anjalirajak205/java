import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

class Student {
    int rollNo;
    String name; int age;
    public Student (int age ,String name, int rollNo){
        this.rollNo=rollNo;
        this.name= name;
        this.age=age;
    }
public String toString(){
    return rollNo + " " + name + " " +age;
}
  
}
class sortByName implements Comparator<Student>{
    
    public int compare(Student s1, Student s2) {
         return s1.name.compareTo(s2.name);
    }
}
class sortByrollNo implements Comparator<Student>{
    
    public int compare(Student s1, Student s2) {
         return s1.rollNo-s2.rollNo;
    }
}


public class sortName {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(20, "Anushka", 49));
        list.add(new Student(12, "Sneha", 209));
        list.add(new Student(19, "Deeksha", 81));
       // Collections.sort(list,new sortByName());
       Collections.sort(list,new sortByrollNo());
       
        for(Student s:list){
            System.out.println(s);
        }
        System.out.println(list);


    }
    
}
