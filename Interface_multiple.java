interface Client1{
    void show();
}
interface Client2{
    void show();
    void print();
}
class Dev implements Client1,Client2{
    public void show(){
        System.out.println("hiii");
}
public void print(){
    System.out.println("hello");
}

}
public class Interface_multiple {
    public static void main(String[] args) {
        Dev obj=new Dev();
        obj.show();
        obj.print();
    }
}
