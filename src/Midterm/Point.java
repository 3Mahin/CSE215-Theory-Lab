package Midterm;

public class Point {
    private double x;
    private double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    Point(){
        x = 2;
        y = 3;
    }

    public double distance(){
        double a = x*x;
        double b = y*y;

        return Math.sqrt(a+b);
    }
    public Point midpoint(Point p){
        p.x += this.x;
        p.y += this.y;

        p.x /= 2;
        p.y /= 2;

        return p;
    }
}
