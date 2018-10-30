package abstractClassAndInterface;

/**
 * @author Liaohaibo
 * @date 2018/10/28 上午12:24
 */
public class index {

    public static void main(String[] args) {
        Shape rect = new Rect(100,200);
        Shape circle = new Circle(60);
        ShapeUtil util = new ShapeUtil();
        System.out.println(rect.areas());
        System.out.println(circle.areas());
        System.out.println(util.isGreaterThan(rect,circle));
        System.out.println(util.isLessThan(rect,circle));

        Shape shapes[] = {rect,circle};
        System.out.println(util.sum(shapes));
    }
}
