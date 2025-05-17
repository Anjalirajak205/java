class Shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void CalculateArea(){
        System.out.println("Calculating area of a circle = 3.14*r*r");
        }
        }


public class figure {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.CalculateArea();
        }
        }
    

