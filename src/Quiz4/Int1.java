package Quiz4;

public interface Int1 {
    void func1();
    default void test(){
        System.out.println("Test");
    }
}
