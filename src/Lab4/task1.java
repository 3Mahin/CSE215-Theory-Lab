package Lab4;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] num = new int[6];
        double avg=0;
        int count=0;
        double percentage;

        for(int i=0; i<num.length; i++){
            System.out.print("Enter number["+(i+1)+"]: ");
            num[i] = scan.nextInt();
        }
        scan.nextLine();

        for(int i=0; i<num.length; i++){
            avg+=num[i];
        }
        avg = avg/num.length;

        for(int i=0; i<num.length; i++){
            if(num[i]>avg){
                count++;
            }
        }
        percentage = ((double)count/num.length)*100;

        System.out.println("Average: "+avg);
        System.out.println("Percentage: "+percentage+"%");

    }
}
