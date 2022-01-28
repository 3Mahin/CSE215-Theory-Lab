package Lab5;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        //Task 1
        System.out.println("###Task 1###");
        System.out.print("Enter a string: ");
        String sen = scan.nextLine();

        Task1_and_Task2 method1 = new Task1_and_Task2();

        method1.countVowels(sen);
        System.out.println("\n");

        //Task 2
        System.out.println("###Task 2###");
        System.out.print("Enter a string: ");
        String sen2 = scan.nextLine();

        Task1_and_Task2 method2 = new Task1_and_Task2();

        method2.isPalindrome(sen2);
        System.out.println();

        //Task 3
        Task3 bank = new Task3();

        System.out.println("###Task 3###");
        String[] options = {"Deposit","Withdraw","Balance","Exit"};
        int n;

        do {
            System.out.println("Press the number corresponding to the options");
            System.out.println();
            for(int i=0; i<options.length;i++){
                System.out.println((i+1)+". "+options[i]);
            }
            n = scan.nextInt();
            scan.nextLine();

            if(n==1){
                bank.deposit();
                System.out.println("Amount deposited successfully!\n");
            }
            else if(n==2){
                bank.withdraw();
                System.out.println("Amount withdrawn successfully!\n");
            }
            else if(n==3){
                bank.balance();
            }
            else if(n<=0 || n>4){
                System.out.println("Invalid option!!!");
            }

        }while(n!=4);

    }
}