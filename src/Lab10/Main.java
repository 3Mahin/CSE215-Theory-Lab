package Lab10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        Student obj = new Student();
        Student[] array = new Student[10];

        String name;
        int marks;
        double cgpa;

        obj.fcreate();

        for(int i=0; i<array.length; i++){
            System.out.println("Enter Student "+(i+1)+ " Info: ");
            System.out.print("Enter name: ");
            name = scan.nextLine();
            System.out.print("Enter marks: ");
            marks = scan.nextInt();
            System.out.print("Enter CGPA: ");
            cgpa = scan.nextDouble();
            scan.nextLine();

            array[i] = new Student(name,marks,cgpa);
        }

        obj.fwrite(array);
        System.out.println("\nReading file");
        obj.fread();
        obj.maxmin(array);
        obj.sumavg(array);

    }
}
