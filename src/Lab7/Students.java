package Lab7;

public class Students {

    void info(String[] name, String[] id, double[] cgpa){

        double sum=0;
        int count=0;

        for(int i=0; i<name.length; i++){
            System.out.println("Name: "+name[i]);
            System.out.println("ID: "+id[i]);
            System.out.println("CGPA: "+cgpa[i]);
            System.out.println();
            sum+=cgpa[i];
            count++;
        }
        System.out.println("Sum: "+sum);
        System.out.println("Average CGPA: "+(sum/count));
    }

    void info(String[] name, double[] marks){
        int max=-1;
        for(int i=0; i<marks.length-1;i++){
            if(marks[i]>marks[i+1]){
                max = i;
            }
        }
        if(max>-1){
            System.out.println("Name of topper: "+name[max]);
            System.out.println("Marks of topper: "+marks[max]);
        }

    }
}
