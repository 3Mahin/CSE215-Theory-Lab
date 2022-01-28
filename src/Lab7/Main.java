package Lab7;

public class Main {
    public static void main(String[] args){
        Students stud = new Students();

        String[] names = {"Daniel Craig","Tom Cruise","Paul Walker","Keanu Reeves"};
        String[] id = {"1111","2222","3333","4444"};
        double[] cgpa = {3.2, 3.7, 2.6, 3.9};

        stud.info(names,id,cgpa);
        System.out.println("........................................");
        stud.info(names,cgpa);
    }
}
