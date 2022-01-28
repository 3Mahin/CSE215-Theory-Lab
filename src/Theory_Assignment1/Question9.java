package Theory_Assignment1;

public class Question9 {
    public static void main(String[] args){
        Box b1 = new Box(1,2,3);

        b1.setDepth(6);
        b1.setHeight(4);
        b1.setWidth(5);

        System.out.println(b1.getHeight());
        System.out.println(b1.getWidth());
        System.out.println(b1.getDepth());
    }
}
