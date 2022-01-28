package Assignment_Lab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HighestSalary extends EmployeeData {
    HighestSalary(){

    }

    @Override
    void hSalary(String[] a,int[] b,double[] c,String[] d,String[] e,String[] f,int n) throws IOException {
        File file = new File("highest.txt");
        FileWriter filew = new FileWriter("highest.txt");

        double max =0;
        int flag = -1;
        for(int i=0; i<c.length; i++){
            if(c[i]>=max){
                max = c[i];
                flag = i;
            }
        }
        filew.write(a[flag]+" "+b[flag]+" "+c[flag]+" "+d[flag]+" "+e[flag]+" "+f[flag]+"\n");
        filew.close();
        System.out.println("Highest Salary Information Stored Successfully");

    }

    @Override
    void lSalary(String[] names, int[] jobIds, double[] salaries, String[] phones, String[] addresses, String[] designation, int n) throws IOException{

    }

}
