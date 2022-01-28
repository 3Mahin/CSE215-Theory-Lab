package Quiz1;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] a = new int[7];

        for(int i=0; i<7;i++)
        {
            System.out.print("Enter a number: ");
            a[i]=scan.nextInt();
            scan.nextLine();
        }

        int flag=0;
        System.out.print("\nEven numbers: ");
        for(int x: a)
        {

            if(x%2==0)
            {
                flag++;
                System.out.print(x+" ");
            }
        }
        System.out.println("\nnumber of even number= "+flag);

        scan.close();
    }

}