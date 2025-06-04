class Myrunable extends Thread {
    public void run (){
        System.out.println("Threads using runable interface");
    }
}
public class multithreading2 {
    public static void main(String[] args) {
        //Myrunable obj = new Myrunable();
        Myrunable t1 = new Myrunable();
        t1.start();
        try{
            t1.join();
        } catch (Exception e){

        }
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("Main thread is running");
    }
    
}
