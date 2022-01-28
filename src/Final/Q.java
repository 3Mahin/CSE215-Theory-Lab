package Final;

public class Q {
    int n[];
    int size;
    int content;

    Q(int size){
        n = new int[size];
        this.size = size;
        content = -1;
    }

    boolean isFull(){
        return content == (size-1);
    }

    boolean isEmpty(){
        return content == -1;
    }
    synchronized int get(){
        while (isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught");
            }
        }
            System.out.println("Got("+content+"):"+n[content]);
            content--;
            notify();
            return n[content+1];
    }

    synchronized void puts(int n) {
        while(isEmpty())
            try {
                wait();
            }
        catch(InterruptedException e) {
                System.out.println("Put: " + n);
            }
        notify();
    }
}
