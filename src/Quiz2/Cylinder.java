package Quiz2;

public class Cylinder {
    double height;
    double radius;

    Cylinder(double height,double radius){
        this.height = height;
        this.radius = radius;
    }

    double getVolume(){
        return (3.14*height*(radius*radius));
    }
}
