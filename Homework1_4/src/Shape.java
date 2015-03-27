import javafx.geometry.Point3D;

/**
 * Created by Administrator on 2015/3/27.
 */
public abstract class Shape implements Comparable<Shape>{

    protected Point3D location;

    public abstract String toString();

    protected Shape(double x,double y, double z){

        location = new Point3D(x,y,z);
    }

    public Point3D getLocation(){

        return location;
    }

    @Override
    public int compareTo(Shape o) {

        if(location.getZ() > o.getLocation().getZ())
            return 1;

        else if (location.getZ() < o.getLocation().getZ())
            return -1;

        return 0;
    }
}
