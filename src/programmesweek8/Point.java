package programmesweek8;

public class Point {
    int x;
    int y;

   public static void main(String[] args) {
        Point first= new Point(6,5);
        Point second = new Point(3,1);
        System.out.println("distance(0,0) = " +first.distance());
        System.out.println("distance(second) = " +first.distance(second.getX(), second.getY()));
        System.out.println("distance(2,2) = " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance() = " +point.distance());
    }

public Point (){
}
public Point (int x, int y) {           //initialize parameters
    this.x = x;
    this.y = y;
    }

public int getX(){                      //returns value of x
    return x;
    }

public int getY(){                      //returns value of y
    return y;
    }

public void setX(int x){                     //sets value of x
    this.x =x;
    }

public void setY(int y){                     //sets value of y
    this.y = y;
    }

public double distance(){      //returns distance betn this point and point(0,0)
    return Math.sqrt( x*x + y*y);
    }

public double distance(int x, int y ){      //returns dis bet this and point(x,y)
    return Math.sqrt((this.x-x)* (this.x -x) + (this.y-y ) * (this.y-y));
    }

public double distance (double x, double y) {
    return Math.sqrt((this.x - x) * (this.x -x) + (this.y - y) * (this.y - y));
    }
}

