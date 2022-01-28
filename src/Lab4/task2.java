package Lab4;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a=0;
        int b=1;
        int temp;

        System.out.print("Enter the nth term: ");
        int n = scan.nextInt();
        scan.nextLine();
        int[] fibo = new int[n];

        if(n>2){
            fibo[0]=0;
            fibo[1]=1;
            for(int i=2; i<n; i++){
                temp = b;
                b = b+a;
                a = temp;
                fibo[i]=b;
            }
            System.out.print("First "+n+" Fibonacci numbers: ");
            for(int i =0; i<fibo.length; i++){
                System.out.print(fibo[i]+" ");
            }
        }
        else if (n==1){
            fibo[0]=0;
            System.out.print("First "+n+" Fibonacci numbers: ");
            System.out.print(fibo[0]);
        }
        else if (n==2){
            fibo[0]=0;
            fibo[1]=1;
            System.out.print("First "+n+" Fibonacci numbers: ");
            for(int i=0; i< fibo.length;i++){
                System.out.print(fibo[i]+" ");
            }
        }
        else{
            System.out.println("Invalid!");
        }
    }
}