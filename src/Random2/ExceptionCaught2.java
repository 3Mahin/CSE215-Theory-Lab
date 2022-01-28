package Random2;

public class ExceptionCaught2 {
        public static void main(String args[]) {
            int a = 10, b=0 ,c=0;

            try {
                c= a/b;

                System.out.println("This will never print");
            }catch(Exception e) {
                System.out.println("In catch");
            }finally {
                System.out.println("In finally");
            }
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
        }

}

