package classLearn;

/**
 * @author Liaohaibo
 * @date 2018/10/27 下午10:36
 */


/**
 * Java 一个子类只允许继承一个父类
 * 继承是 is关系 而组合 是 has关系
 * 组合就是可以在Student类中 private Book book来使用book
 */
public class Student extends Person{

    private int score;

    /**
     * 子类的构造方法：Student
     * 1. 子类的构造方法第一句必须是super();没有super()会自动创建
     * 2. super() 表示将父类的构造方法全部拿进来
     * 3. 如果父类没有默认的构造方法，子类就必须显示调用super()
     */
    public Student() {
        super();
        System.out.println("create Student Class......");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String hello() {
        return "hello," + this.name;         // this.name 访问的是父类Person中的name，private不行，public、protected可以
    }
}
