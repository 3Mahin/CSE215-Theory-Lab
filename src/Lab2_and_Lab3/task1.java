package Lab2_and_Lab3;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.nextLine();

        int result = num%2;

        switch(result){
            case 0:
                System.out.println("Even");
                break;

            default:
                System.out.println("Odd");
                break;

        }
    }
}
