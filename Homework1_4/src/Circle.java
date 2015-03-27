/**
 * Created by Administrator on 2015/3/27.
 */
public final class Circle extends Shape{

    final String name = this.getClass().getName();

    public Circle(double x,double y, double z){
        super(x,y,z);
    }
    @Override
    public String toString() {

        return getLocation().toString()+" "+name;
    }

}
