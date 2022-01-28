package Lab_Quiz1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] gender = new String[6];
        String[] names = new String[6];
        int[] marks = new int[6];

        for(int i=0; i<6; i++){
            System.out.println("Enter Gender(male/female): ");
            gender[i]=scan.nextLine();
            System.out.println("Enter Name: ");
            names[i]=scan.nextLine();
            System.out.println("Enter Marks: ");
            marks[i]=scan.nextInt();
            scan.nextLine();
        }

        NSU stud = new NSU();

        stud.ECE(gender,names,marks);

    }
}
