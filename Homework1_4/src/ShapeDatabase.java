

import java.util.*;

/**
 * Created by Administrator on 2015/3/27.
 */
public final class ShapeDatabase implements Iterable<Shape> {

    Optional<List<Shape>> allShapes = Optional.of( new ArrayList<Shape>());

    public void insert(Shape o){

        allShapes.get().add(o);
    }

    public void sort(){

        Collections.sort(allShapes.get());
    }

    public Iterator<Shape> iterator(){

        return allShapes.get().iterator();
    }

    public void clear(){
        allShapes.get().clear();
    }
}
