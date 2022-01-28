package Assignment_Lab;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Display implements Salary{
    @Override
    public void allData() throws FileNotFoundException {
        FileReader filer = new FileReader("EmployeeInformation.txt");
        Scanner read = new Scanner(filer);

        String name;
        String jobid;
        String salary;
        String phone;
        String address;
        String destination;

        System.out.println("All Employee:");
        System.out.println("Name\tJobID\tSalary\tPhone\tAddress\tDestination");
        while(read.hasNext()){
            name = read.next();
            jobid = read.next();
            salary = read.next();
            phone = read.next();
            address = read.next();
            destination = read.next();
            System.out.println(name+"\t"+jobid+"\t"+salary+"\t"+phone+"\t"+address+"\t"+destination);
        }
    }

    @Override
    public void lowest() throws FileNotFoundException {
        FileReader filer = new FileReader("lowest.txt");
        Scanner read = new Scanner(filer);

        String name;
        String jobid;
        String salary;
        String phone;
        String address;
        String destination;

        System.out.println("Lowest Salary:");
        System.out.println("Name\tJobID\tSalary\tPhone\tAddress\tDestination");
        while(read.hasNext()){
            name = read.next();
            jobid = read.next();
            salary = read.next();
            phone = read.next();
            address = read.next();
            destination = read.next();
            System.out.println(name+"\t"+jobid+"\t"+salary+"\t"+phone+"\t"+address+"\t"+destination);
        }
    }

    @Override
    public void highest() throws FileNotFoundException {
        FileReader filer = new FileReader("highest.txt");
        Scanner read = new Scanner(filer);

        String name;
        String jobid;
        String salary;
        String phone;
        String address;
        String destination;

        System.out.println("Highest Salary:");
        System.out.println("Name\tJobID\tSalary\tPhone\tAddress\tDestination");
        while(read.hasNext()){
            name = read.next();
            jobid = read.next();
            salary = read.next();
            phone = read.next();
            address = read.next();
            destination = read.next();
            System.out.println(name+"\t"+jobid+"\t"+salary+"\t"+phone+"\t"+address+"\t"+destination);
        }
    }

    @Override
    public void average(int n) throws FileNotFoundException {
        FileReader filer = new FileReader("EmployeeInformation.txt");
        Scanner read = new Scanner(filer);

        String name;
        String jobid;
        double salary;
        String phone;
        String address;
        String destination;

        double average = 0;

        while(read.hasNext()){
            name = read.next();
            jobid = read.next();
            salary = read.nextDouble();
            phone = read.next();
            address = read.next();
            destination = read.next();

            average += salary;
        }
        System.out.println("Average: "+average/n);
    }
}
