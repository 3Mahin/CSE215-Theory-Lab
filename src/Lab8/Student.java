package Lab8;

public class Student {
    String name;
    int marks;
    double cgpa;

    public Student(){
        name = null;
        marks = 0;
        cgpa = 0;
    }
    public Student(String name, int marks, double cgpa){
        this.name = name;
        this.marks = marks;
        this.cgpa = cgpa;

    }
    void evenSum(Student[] arr){
        int sum=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].marks%2==0){
                sum += arr[i].marks;
            }
        }
        System.out.println("Even Marks Summation: "+sum);

    }
    void maximum(Student[] arr){
        int max=0;
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].marks>max){
                max = arr[i].marks;
                count=i;
            }
        }
        System.out.println("Student with the maximum marks:");
        System.out.println("Name: "+arr[count].name+"\nMarks: "+arr[count].marks+"\nCGPA: "+arr[count].cgpa);
    }

    void evenSumAvgMarks(Student[] arr){
        double sum=0;
        int flag=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].marks%2==0){
                sum += arr[i].marks;
                flag++;
            }
        }
        System.out.println("Average Even Sum: "+sum/flag);
    }

    void oddSumAvgMarks(Student[] arr){
        double sum=0;
        int flag=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].marks%2!=0){
                sum += arr[i].marks;
                flag++;
            }
        }
        System.out.println("Average Odd Sum: "+sum/flag);
    }

    void minMarksInfo(Student[] arr){
        int min = arr[0].marks;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i].marks<=min){
                min = arr[i].marks;
                count = i;
            }
        }
        System.out.println("Student with the minimum marks: ");
        System.out.println("Name: "+arr[count].name+"\nMarks: "+arr[count].marks+"\nCGPA: "+arr[count].cgpa);
    }

    void sumAvgCgpa(Student[] arr){
        double sum=0;

        for(int i=0; i<arr.length; i++){
            sum += arr[i].cgpa;
        }
        System.out.println("Sum Average of CGPA: "+sum/arr.length);
    }

}
