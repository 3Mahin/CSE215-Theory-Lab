package Lab5;

import java.util.Scanner;

public class Task3 {
    Scanner scan = new Scanner(System.in);
    double balance=0;

    void deposit(){
        System.out.print("Enter the amount to deposit: ");
        double amount = scan.nextDouble();
        scan.nextLine();
        balance += amount;
    }
    void withdraw(){
        System.out.print("Enter the amount to withdraw: ");
        double amount = scan.nextDouble();
        scan.nextLine();
        balance -= amount;
    }
    void balance(){
        System.out.println("Your current balance is: "+balance+"\n");
    }
}