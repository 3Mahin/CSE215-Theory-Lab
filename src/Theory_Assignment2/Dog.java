package Theory_Assignment2;

public class Dog extends Animal implements Pet{

    public void bark(){
        System.out.println("Barking");
    }
    @Override
    public void train() {
        System.out.println("Dog is training (Called from dog class)");
    }
}
