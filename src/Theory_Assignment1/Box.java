package Theory_Assignment1;

public class Box {
    private double height;
    private double width;
    private double depth;

    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }

    //mutator(setters)
    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //accessor(getters)
    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


}
