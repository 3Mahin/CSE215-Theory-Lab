package Lab9;

public class Shape {
    private String name;

    Shape(){
        name = null;
    }
    Shape(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double area(){
        return 0;
    }

    public double perimeter(){
        return 0;
    }
}
