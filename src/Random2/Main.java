package Random2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();

        Thread2 obj = new Thread2();
        Thread t2 = new Thread(obj);

        t1.start();
        t2.start();

    }
}
