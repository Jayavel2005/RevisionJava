class Bank{
    private int Balance = 1000;
    public synchronized void deposit(int amount){
        Balance += amount;
        System.out.println(Balance);
    }



    public synchronized void withDraw(int amount){
        if (Balance >= amount) {
            Balance -= amount;
            System.out.println(Balance);
        }else{
            System.out.println("Not enough money");
        }
    }

    public int getBalance(){
        return Balance;
    }
}
class A extends Thread{
    Bank account;
    A(Bank accout){
        this.account = accout;
    }

    public void deposit(){
        for(int i = 0;i<5;i++){
            account.deposit(100);
        }
    }
    public void withDraw(){
        for(int i = 0;i<5;i++){
            account.withDraw(50);
        }
    }
    public void run(){
        deposit();
        withDraw();
    }

    
}
class B extends Thread{
    Bank account;
    B(Bank accout){
        this.account = accout;
    }

    public void deposit(){
        for(int i = 0;i<5;i++){
            account.deposit(200);
        }
    }
    public void withDraw(){
        for(int i = 0;i<5;i++){
            account.withDraw(50);
        }
    }

    public void run(){
        deposit();
        withDraw();
    }

    
}
public class q11 {
    public static void main(String[] args) throws InterruptedException {
        Bank c = new Bank();
        A a = new A(c);
        B b = new B(c);

        a.start();
        b.start();

        a.join();
        b.join();
        

        System.out.println(c.getBalance());
    }
    
}