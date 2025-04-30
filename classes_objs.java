class Student{
    String firstName="anjali";
    String lastName="rajak";
    void fullName(){
        System.out.println(firstName+ " " +lastName);
    }
}
class Rectangle{
   // int l=30;
    // int w=10;
    int area(int l, int w){
       int area=l*w;
       return area;
    }
}


public class classes_objs {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.fullName();

        Rectangle r = new Rectangle();
        System.out.println(r.area(30, 10));
        
    }
    
    
}
