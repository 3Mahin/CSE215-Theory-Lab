package NSUPS;
import java.util.Scanner;
public class problem6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        int n;
        int rem;
        int sum=0;
        int[]ans=new int[T];
        int[]arr=new int[T];
        for(int i=0; i<T; i++){
            n = scan.nextInt();
            while(n>0){
               rem=n%10;
               sum+=rem;
               n/=10;
            }
            ans[i] = sum;
            sum=0;
        }
        for(int i=0; i<T; i++){
            System.out.println(ans[i]);
        }
    }
}
