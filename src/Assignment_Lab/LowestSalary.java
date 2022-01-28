package Assignment_Lab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LowestSalary extends EmployeeData {
    LowestSalary(){

    }

    @Override
    void lSalary(String[] names, int[] jobIds, double[] salaries, String[] phones, String[] addresses, String[] designation, int n) throws IOException{
        File file = new File("lowest.txt");
        FileWriter filew = new FileWriter("lowest.txt");

        double min =salaries[0];
        int flag = -1;
        for(int i=0; i<salaries.length; i++){
            if(salaries[i]<=min){
                min = salaries[i];
                flag = i;
            }
        }
        filew.write(names[flag]+" "+jobIds[flag]+" "+salaries[flag]+" "+phones[flag]+" "+addresses[flag]+" "+designation[flag]+"\n");
        filew.close();
        System.out.println("Lowest Salary Information Stored Successfully");

    }

    @Override
    public void hSalary(String[] names, int[] jobIds, double[] salaries, String[] phones, String[] addresses, String[] designation, int n) throws IOException {

    }
}
