package abstractClassAndInterface;

/**
 * @author Liaohaibo
 * @date 2018/10/28 上午12:11
 */
public class ShapeUtil {

    public double sum (Shape shapes[]) {
        double s = 0;
        for (Shape shape : shapes) {
            s += shape.areas();
        }
        return s;
    }

    public boolean isGreaterThan(Shape shape1, Shape shape2) {
        return shape1.areas() > shape2.areas();
    }

    public boolean isLessThan(Shape shape1, Shape shape2) {
        return shape1.areas() < shape2.areas();
    }


}
