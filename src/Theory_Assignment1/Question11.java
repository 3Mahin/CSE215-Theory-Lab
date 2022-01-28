package Theory_Assignment1;

public class Question11{
    public static void main(String[] args){
        Complex c1 = new Complex(1,2,3,4,5,6);

        c1 = c1.add(c1);
        System.out.println("Complex Number after adding: "+c1.real+" + "+c1.imag+"i");
    }

}