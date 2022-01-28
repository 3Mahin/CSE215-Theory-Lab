package Lab6;

public class House {

    String colour;
    int no_of_floors;
    boolean lift;

    House(String c, int f, boolean l)
    {
        colour = c;
        no_of_floors =f;
        lift = l;

    }
    House()
    {
        colour = "Red";
        no_of_floors= 11;
        lift=false;
    }

    void printInfo()
    {
        System.out.println("This "+colour+" house has "+no_of_floors+" floor");
        //System.out.println();
        System.out.println("The building also has a lift: "+lift);
        System.out.println();
    }



}