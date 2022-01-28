package Lab9;

public class Rectangle extends Shape{
    private double length;
    private double width;

    Rectangle(String name, double length, double width){
        this.length = length;
        this.width = width;
        super.setName(name);
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double width) {
        this.width = width;
    }

    public double area(){
        return length*width;
    }
    public double perimeter(){
        return((length+length)+(width+width));
    }
}
