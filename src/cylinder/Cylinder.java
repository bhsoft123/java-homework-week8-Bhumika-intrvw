package cylinder;

public class Cylinder extends Circle{

    double height;

    public Cylinder (double radius, double height){
        super(height);
        if(height<0){this.height=0;}
        else{ this.height = height;}
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
