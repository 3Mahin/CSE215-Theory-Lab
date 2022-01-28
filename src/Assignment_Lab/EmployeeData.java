package Assignment_Lab;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class EmployeeData {
    EmployeeData(){

    }

    public void data(int n) throws Exception{
        FileReader filer = new FileReader("EmployeeInformation.txt");
        Scanner read = new Scanner(filer);

        String[] names = new String[n];
        int[] jobIds = new int[n];
        double[] salaries = new double[n];
        String[] phones = new String[n];
        String[] addresses = new String[n];
        String[] designation = new String[n];

        while(read.hasNext()){
            for(int i=0; i<n; i++){
                names[i] = read.next();
                jobIds[i] = read.nextInt();
                salaries[i] = read.nextDouble();
                phones[i] = read.next();
                addresses[i] = read.next();
                designation[i] = read.next();
            }
            hSalary(names, jobIds, salaries, phones, addresses, designation, n);
            lSalary(names, jobIds, salaries, phones, addresses, designation, n);

        }
        filer.close();
    }

    abstract void hSalary(String[] names, int[] jobIds, double[] salaries, String[] phones, String[] addresses, String[] designation, int n) throws IOException;
    abstract void lSalary(String[] names, int[] jobIds, double[] salaries, String[] phones, String[] addresses, String[] designation, int n) throws IOException;
}
