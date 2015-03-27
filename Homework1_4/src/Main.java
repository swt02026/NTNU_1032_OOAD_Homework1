/**
 * Created by Administrator on 2015/3/27.
 */
public class Main {
    public static void main(String[] args){

        ShapeDatabase db = new ShapeDatabase();

        System.out.println("case1 with sort");
        db.insert(new Triangle(1,2,3));
        db.insert(new Circle(1,2,5));
        db.insert(new Square(1,2,2));

        db.sort();

        db.forEach((shape)-> {
            System.out.println(shape.toString());
        });
        System.out.println();


        System.out.println("case2");
        db.insert(new Circle(1,3,3));
        db.insert(new Circle(1,5,7));
        db.insert(new Circle(1,0,0));
        db.insert(new Square(1,2,10));

        db.forEach((shape)-> {
            System.out.println(shape.toString());
        });
        System.out.println();


        System.out.println("case2 with sort");
        db.sort();
        db.forEach((shape)-> {
            System.out.println(shape.toString());
        });


        db.clear();
        db.forEach((shape)-> {
            System.out.println(shape.toString());
        });
    }
}
