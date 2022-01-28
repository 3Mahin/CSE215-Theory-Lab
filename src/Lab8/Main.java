package Lab8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Student[] array = new Student[3];

        String name;
        int marks;
        double cgpa;

        for(int i=0; i<3; i++){
            System.out.println("Enter Student "+(i+1)+" info: ");
            name = scan.nextLine();
            marks = scan.nextInt();
            cgpa = scan.nextDouble();
            scan.nextLine();

            array[i] = new Student(name, marks, cgpa);
        }

        for(int i=0; i<3; i++){
            System.out.println("Name: "+array[i].name+"\nMarks: "+array[i].marks+"\nCGPA: "+array[i].cgpa);
            System.out.println();
        }
        System.out.println("..................................");

        Student object = new Student();

        object.evenSum(array);
        System.out.println("..................................");
        object.maximum(array);
        System.out.println("..................................");
        object.evenSumAvgMarks(array);
        System.out.println("..................................");
        object.oddSumAvgMarks(array);
        System.out.println("..................................");
        object.minMarksInfo(array);
        System.out.println("..................................");
        object.sumAvgCgpa(array);
    }
}
