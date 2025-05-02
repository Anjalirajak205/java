public class bank_account {
    String accNo;
    String  accHolder;
    double balance;

    void setAccount(String num,String name, double bal){
        accNo=num;
        accHolder=name;
        balance=bal;


    }
    void deposit(double amount){
        balance = balance+amount;
        System.out.println("Deposited:"+amount);

    }
    void withdraw(double amount){
        if(amount<=balance){
            balance=balance-amount;

            System.out.println("Withdraw:"+amount);


        }else{
            System.out.println("Not enough balance");

        }
    }
    void showAccount(){
        System.out.println("Account Number:"+accNo);
        System.out.println("Account holder name:"+accHolder);
        System.out.println("Balance:"+balance);
    }

    public static void main(String[] args) {
        bank_account acc=new bank_account();
        acc.setAccount("1025986456", "Anjali", 2000.0);
        acc.showAccount();
        acc.withdraw(700);
        acc.showAccount();


    }
    }
    
    

