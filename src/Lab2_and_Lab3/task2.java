package Lab2_and_Lab3;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int count=0;

        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        scan.nextLine();

        for(int i=2; i<num; i++){
            if(num%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.println(num+" is not a prime number");
        }
        else{
            System.out.println(num+" is a prime number");
        }
    }
}
