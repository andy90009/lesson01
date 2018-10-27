package abstractClassAndInterface;

/**
 * @author Liaohaibo
 * @date 2018/10/28 上午12:21
 */
public class Circle extends Shape{

    private double redius;

    public Circle(double redius) {
        this.redius = redius;
    }


    @Override
    public double areas() {
        return Math.PI * redius * redius;
    }
}
