package Assignment_Lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Employee e1 = new Employee();
        HighestSalary e2 = new HighestSalary();
        LowestSalary e3 = new LowestSalary();
        Display value = new Display();

        System.out.println("Enter the number of employee to store: ");
        int n = scan.nextInt();
        scan.nextLine();

        e1.information(n);
        e2.data(n);
        e3.data(n);

        System.out.println();
        value.lowest();

        System.out.println();
        value.highest();

        System.out.println();
        value.average(n);

        System.out.println();
        value.allData();

    }
}
