package staticLearn;

/**
 * @author Liaohaibo
 * @date 2018/10/29 上午9:44
 */

/**
 *  static
 *  静态字段：
 *  1. 静态字段自有一个共享空间，所有实例都共享该字段
 *  2. 推荐使用类名.静态字段
 *  3. 可以理解为 修饰类的
 *  静态方法：
 *  1. 类似静态字段
 *  2. 常用于工具、辅助方法
 */


public class Person {

    private static int number;

    private String name;

    public Person(String name) {
        this.name = name;
        number ++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
