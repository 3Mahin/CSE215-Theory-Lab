package Lab7;

public class task1 {

    static void printIandC(int i, char c){
        System.out.println("Integer: "+i);
        System.out.println("Character: "+c);
    }
    static void printIandC(char c, int i){
        System.out.println("Integer: "+i);
        System.out.println("Character: "+c);
    }

    public static void main(String[] args){
        int i=1;
        char c='A';

        printIandC(i,c);
        System.out.println();
        printIandC(c,i);
    }

}
