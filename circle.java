public class circle {

    int radius;
    circle(int r){
        radius=r;
    }
    int area(){
        return(22*radius*radius)/7;


    }
    int  circumference(){
        return(2*22*radius)/7;
    }
    public static void main(String[] args) {
        circle c = new circle(10);
        System.out.println("Radius:"+c.radius);
        System.out.println("Area:"+c.area());
        System.out.println("circumference:"+c.circumference());
        
    }
}
