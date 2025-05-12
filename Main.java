class employe{
    void work(){
        System.out.println("Empoye is working");
    }
    
    }
    class Manager extends employe{
        void attendMeeting(){
            System.out.println("Manager is attending meeting");
            }
            }
    public class Main {
                public static void main(String[] args) {
                    Manager manager = new Manager();
                    manager.work();
                    manager.attendMeeting();
            }

}