package Lab2_and_Lab3;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.nextLine();

        if(num>0){
            System.out.print("Divisors: ");

            for(int i=1; i<num; i++){
                if(num%i==0){
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("Invalid Number!");
        }
    }
}