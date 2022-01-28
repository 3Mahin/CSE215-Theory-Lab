package Lab10;

import java.io.*;
import java.util.Scanner;

public class Student {

    private String name;
    private int marks;
    private double cgpa;

    public Student(String name, int marks, double cgpa) {
        this.name = name;
        this.marks = marks;
        this.cgpa = cgpa;
    }
    public Student(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }

    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void fcreate() throws Exception{
        File obj = new File("Data.txt");
        if(obj.createNewFile()){
            System.out.println("File Created");
        }
        else{
            System.out.println("File already exists");
        }
    }
    public void fwrite(Student[] array) throws Exception{
        FileWriter fr = new FileWriter("Data.txt");

        for(int i=0; i<array.length; i++){
            fr.write(array[i].name+" "+String.valueOf(array[i].marks)+" "+String.valueOf(+array[i].cgpa)+"\n");
        }
        fr.close();
    }
    public void fread() throws Exception{
        FileReader fr = new FileReader("Data.txt");
        Scanner read = new Scanner(fr);
        Student[] obj = new Student[10];
        int i = 0;
        while(read.hasNext()){
            obj[i] = new Student();
            obj[i].name = read.next();
            obj[i].marks = read.nextInt();
            obj[i].cgpa = read.nextDouble();
            i++;
        }
        for(int j=0; j<obj.length; j++){
            System.out.print(obj[j].name+" "+obj[j].marks+" "+obj[j].cgpa+"\n");
        }
    }
    public void maxmin(Student[] array) throws Exception{

        int max=0;
        for(int i=0; i<array.length; i++){
            if(array[i].marks>max){
                max = array[i].marks;
            }
        }
        FileWriter obj1 = new FileWriter("max.txt");
        obj1.write(String.valueOf(max)+"\n");
        obj1.close();

        int min=array[0].marks;
        for(int i=0; i<array.length; i++){
            if(array[i].marks<min){
                min = array[i].marks;
            }
        }
        FileWriter obj2 = new FileWriter("min.txt");
        obj2.write(String.valueOf(min)+"\n");
        obj2.close();

        System.out.println();
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
    public void sumavg(Student[] array) throws Exception{
        int sum=0;
        double avg;
        for(int i=0; i< array.length; i++){
            sum += array[i].marks;
        }
        avg = sum / array.length;

        System.out.println();
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+avg);

        FileWriter sumP = new FileWriter("sum.txt");
        FileWriter avgP = new FileWriter("avg.txt");

        sumP.write(String.valueOf(sum)+"\n");
        sumP.close();
        avgP.write(String.valueOf(avg)+"\n");
        avgP.close();
    }


    /*public void fwrite2() throws Exception{
        FileWriter fr = new FileWriter("Data.txt",true);
        BufferedWriter br = new BufferedWriter(fr);

        br.write("Mushfiq"+" "+"30\n");
        br.write("Mustafiz"+" "+"40\n");
        br.close();
    }*/

}
