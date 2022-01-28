package Assignment_Lab;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Employee {
    public String name;
    public String jobId;
    public String salary;
    public String phone;
    public String address;
    public String designation;

    Scanner scan = new Scanner(System.in);

    Employee(){

    }

    public void information(int n) throws Exception{

        File file = new File("EmployeeInformation.txt");
        FileWriter filew = new FileWriter("EmployeeInformation.txt");

        for(int i=0; i<n; i++){
            System.out.println("Enter Employee "+(i+1)+" Details:");
            System.out.print("Enter name: ");
            name = scan.nextLine();
            System.out.print("Enter JobID: ");
            jobId = scan.nextLine();
            System.out.print("Enter Salary: ");
            salary = scan.nextLine();
            System.out.print("Enter Phone: ");
            phone = scan.nextLine();
            System.out.print("Enter Address: ");
            address = scan.nextLine();
            System.out.print("Enter Designation: ");
            designation = scan.nextLine();

            filew.write(name+" "+jobId+" "+salary+" "+phone+" "+address+" "+designation+"\n");
        }
        filew.close();
        System.out.println("All Employee Information Stored Successfully");
    }
}
