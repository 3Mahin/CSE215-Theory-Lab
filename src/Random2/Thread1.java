package Random2;

public class Thread1 extends Thread{
    public void run(){
        for (int i=0; i<30; i++){
            System.out.print("A");
        }
    }
}
