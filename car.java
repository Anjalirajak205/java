public class car {
    int brand;
    int model;
    int price;

    void details(int b,int m, int p){
        brand=b;
        model=m;
        price=p;
    }
    void show(){
        System.out.println("Brand:"+brand);
        System.out.println("Model:"+model);
        System.out.println("Price:"+price);
        System.out.println();
    }

    public static void main(String[] args) {
        car c1 = new car();
        car c2 = new car();

        c1.details(1,2,20000000);
        c2.details(2,1,3000000);

        c1.show();
        c2.show();
    }
    
}
