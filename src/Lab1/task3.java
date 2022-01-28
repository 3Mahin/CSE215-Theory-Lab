package Lab1;
import java.util.Scanner;

public class task3 {
    public static void main(String [] args){

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = scan.nextInt();

        if (n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}