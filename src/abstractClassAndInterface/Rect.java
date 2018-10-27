package abstractClassAndInterface;

/**
 * @author Liaohaibo
 * @date 2018/10/28 上午12:16
 */
public class Rect extends Shape{

    private double height;

    private double width;

    public Rect(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public double areas() {
        return height * width;
    }
}
