package NSUPS;

import java.util.Arrays;
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int T = scan.nextInt();
        scan.nextLine();

        if(T>=1 && T<=1000){
            int A,B,C;
            int[] smax = new int[T];

            for(int i=0; i<T; i++){
                A = scan.nextInt();
                B = scan.nextInt();
                C = scan.nextInt();
                int[] arr = {A, B, C};
                Arrays.sort(arr);
                smax[i] = arr[1];
            }
            scan.nextLine();
            System.out.println(smax[0]);
            System.out.println(smax[1]);
            System.out.println(smax[2]);
        }
        else{
            System.out.println("Invalid");
        }
    }
}
