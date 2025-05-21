//question 1
/*interface Walkable{
    void walk();
    void run();

}
interface Runnable{
    void walk();
    void run();

}
class Human implements Walkable,Runnable{
    public void walk(){
        System.out.println("walking");
}
public void run(){
    System.out.println("running");
}
}
public class interface_quest {
    public static void main(String[] args) {
        Human h = new Human();
        h.walk();
        h.run();
    
}

}*/

// question 2

/*interface A{
    void display();
}
interface B{
    void display();
}
class Demo implements A,B{
    public void display(){
        System.out.println("display");
    }
}
public class interface_quest {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.display();
    }
}*/

// question 3

/*interface Animal{
    void sound();
    }
    class Dog implements Animal{
        public void sound(){
            System.out.println("barking");
            }
            }
 public class interface_quest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
        }
        }*/

// question 4

/*interface Shape{
    void area();
    }
    class Circle implements Shape{
        int r=5;
        double area= 3.14*r*r;
        public void area(){
            System.out.println("area of circle is "+area);
            }
            }
            public class interface_quest {
                public static void main(String[] args) {
                    Circle c = new Circle();
                    c.area();
                    }



                }*/

// question 5

interface Vehicle{
     default void start(){
        System.out.println("vehicle started.....");
     }
    }
    class Car implements Vehicle{
        //public void start(){
       //}
    }
            public class interface_quest {
                public static void main(String[] args) {
                    Car c = new Car();
                    c.start();
                    }
}






