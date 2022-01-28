package Lab4;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count=0;

        System.out.print("Enter a size for the array: ");
        int n = scan.nextInt();
        scan.nextLine();

        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++){
            System.out.print("Enter number["+(i+1)+"]:");
            arr[i]= scan.nextInt();
            scan.nextLine();
        }
        System.out.print("\nOutput: ");
        for (int i=0; i<arr.length-2; i++){
            if((arr[i]==arr[i+1])&&(arr[i+1]==arr[i+2])){
                count++;
                System.out.print(arr[i]+" ");
            }
        }
    }
}
