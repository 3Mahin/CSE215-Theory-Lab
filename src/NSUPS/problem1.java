package NSUPS;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        scan.nextLine();

        if(n>=3 && n<=100){
            int[] num = new int[n+1];
            int even=0;
            int odd=0;
            int trackeven=-1;
            int trackodd=-1;

            for(int i=1; i<=n; i++){
                num[i] = scan.nextInt();
                if (num[i] % 2 == 0) {
                    even++;
                    trackeven = i;
                }
                else{
                    odd++;
                    trackodd = i;
                }
            }
            scan.nextLine();

            if(even>odd){
                System.out.println(trackodd);
            }
            else
                System.out.println(trackeven);

        }
        else{
            System.out.println("Too short");
        }
    }
}
