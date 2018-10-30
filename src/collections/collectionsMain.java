package collections;

/**
 * @author Liaohaibo
 * @date 2018/10/29 下午10:32
 */
public class collectionsMain {

    /**
     *  集合类：java.util提供了集合类
     *
     *  Collection: 集合类的根接口
     *  1. List: 一种有序列表，例如 按索引排列的Student的List
     *  2. Set: 一种没有重复元素的集合，例如，无重复Student的Set
     *  Map: 一种通过Key查找Value的映射表集合，例如根据name查找对应Student的Map
     */

    /**
     *  Java集合设计的特点：
     *  1. 接口和实现相分离
     *     List接口: ArrayList, LinkedList
     *  2. 支持泛型
     *     List<Student> list = new ArrayList<>()
     *  3. 访问集合有统一的方法:
     *     迭代器
     */

    private Object b;

    public Object getB() {
        return b;
    }

    public void setB(Object b) {
        this.b = b;
    }

    public static void main(String[] args) {

        collectionsMain collectionsMain = new collectionsMain();
        collectionsMain.setB(new Boolean(true));            // 向上转型为object
        System.out.println(collectionsMain.getB());
        collectionsMain.setB(new Float(12.3));
        Integer f = (Integer) collectionsMain.getB();           // 向下转型，报错ClassCastException
        System.out.println(f);

    }
}
