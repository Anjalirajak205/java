class withdraw extends Thread {
    static int totalBalance = 1000;
    int amount ;
    public withdraw(int amount) {
        this.amount = amount ;
    }
    public void run() {
        synchronized(withdraw.class){
            if(totalBalance >= amount){
            System.out.println(Thread.currentThread().getName()+" is going to withdrawl"+ " " + amount);
            try{
                Thread.sleep(1000);

            }
            catch(Exception e){
            }
            totalBalance -= amount;
            System.out.println(Thread.currentThread().getName()+" remaining paisaaa" + " " + totalBalance);
        }
        else{
            System.out.println(Thread.currentThread().getName()+" app gareeb haii !!!");
        }
    }
}

public class bank_thread {
    public static void main(String[] args) {
        withdraw w1 = new withdraw(800);
        withdraw w2= new withdraw(500);
        w1.start(); w2.start();


    }
    
}
}
