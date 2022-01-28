package Random2;

public class Final {

    public static void main(String[] args) {
            try{
                int a[]=new int[2];
                a[2]=30/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("Arithmetic Exception caught");
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("ArrayIndexOutOfBounds Exception caught");
            }
        }
}

