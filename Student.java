public class Student {
    String firstName;
    String lastName;
    int rollNumber;
    int marks;


    void display(){
        System.out.println(firstName+ " " +lastName);
        System.out.println("Roll Number:"+rollNumber);
        System.out.println("Marks:" +marks);
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.firstName="Anjali";
        s1.lastName="Rajak";
        s1.rollNumber=40;
        s1.marks=80;


        Student s2 = new Student();
        s2.firstName="Anushka";
        s2.lastName="Tiwari";
        s2.rollNumber=49;
        s2.marks=90;


        Student s3 = new Student();
        s3.firstName="Sneha";
        s3.lastName="Dubey";
        s3.rollNumber=209;
        s3.marks=85;


        s1.display();
        s2.display();
        s3.display();







    }
    

    
}
