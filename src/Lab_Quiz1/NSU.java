package Lab_Quiz1;
import java.util.Objects;

public class NSU {

    public void ECE(String[]gender,String[]names,int[] marks){
        int sum=0;
        int count=0;
            for(int i=0; i<6;i++){
                if((Objects.equals(gender[i], "male") || Objects.equals(gender[i], "MALE"))&&(marks[i]%2!=0)){
                    sum+=marks[i];
                    count++;
                }
                else if (marks[i]%2==0 &&(Objects.equals(gender[i], "female") || Objects.equals(gender[i], "FEMALE"))){
                    System.out.println(names[i]);
                }
            }

        if(count>0){
            System.out.println("Sum= "+sum);
            System.out.println("Average= "+(sum/count));
        }

    }
}
