package Random2;

public class Multithreading implements Runnable{
    void f1(){
        System.out.println("Thread running");
    }
    @Override
    public void run(){
        f1();
    }
}
