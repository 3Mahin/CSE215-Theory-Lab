package Lab_Quiz1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount to withdraw: ");
        int n = scan.nextInt();
        scan.nextLine();

        if(n>=500){

            if(n%500==0){

                if(n>20000){
                    System.out.println("EXCEEDED AMOUNT");
                }
                else if(n<=20000){
                    System.out.println("TRANSACTION SUCCESSFUL");
                }
                else{
                    System.out.println("Error Occurred");
                }
            }
            else{
                System.out.println("INVALID VALUE");
            }
        }
        else{
            System.out.println("INVALID AMOUNT");
        }
    }
}
