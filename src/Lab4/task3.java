package Lab4;

public class task3 {
    public static void main(String[] args){
        int[][] array = new int[3][3];
        int rSum=0;
        int cSum=0;
        int Sumdiag1=0;
        int Sumdiag2=0;

        array[0][0] =3;
        array[0][1] =4;
        array[0][2] =9;
        array[1][0] =2;
        array[1][1] =9;
        array[1][2] =11;
        array[2][0] =4;
        array[2][1] =6;
        array[2][2] =0;

        //for rows
        for (int i = 0; i<3; i++){
            System.out.print("Sum of Row["+(i+1)+"]: ");
            for (int j=0; j<3; j++){
                rSum+=array[i][j];
            }
            System.out.print(rSum+"\n");
            rSum=0;
        }
        System.out.println();

        //for columns
        for (int i = 0; i<3; i++){
            System.out.print("Sum of Column["+(i+1)+"]: ");
            for (int j=0; j<3; j++){
                cSum+=array[j][i];
            }
            System.out.print(cSum+"\n");
            cSum=0;
        }
        System.out.println();

        //for diagonals
        for (int i=0; i<3; i++){
            Sumdiag1+=array[i][i];
        }
        for (int i=0; i<3; i++){
           Sumdiag2+=array[i][2-i];
        }
        System.out.println("Sum of Diagonal (0,0)to(2,2): "+Sumdiag1);
        System.out.println("Sum of Diagonal (0,2)to(2,0): "+Sumdiag2);
        System.out.println("Sum of both Diagonals: "+(Sumdiag1+Sumdiag2));
    }
}
