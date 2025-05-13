class Human{
    void Name(){
        System.out.println("Name : Anjali");
        }
}
class Student extends Human{
    void Class(){
        System.out.println("Class : 10th");
    }
}
class Monitor extends Student{
    void Discipline(){
        System.out.println("Monitor is checking discipline");
    }

}

public class Person {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        m.Name();
        m.Class();
        m.Discipline();
    
}
}
