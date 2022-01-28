package Final;

public class Main {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Q obj = new Q(5);

        obj.puts(3);
        System.out.println(obj.get());
    }
}
