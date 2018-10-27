package classoverride;

/**
 * @author Liaohaibo
 * @date 2018/10/27 下午11:36
 */
public class index {

    public static void main(String[] args) {

        /**
         * 1. 引用变量的声明类型可能和其实际类型不符
         * 2. 实例对象的方法调用总是对应实际类型
         * 3. Java的实例方法调用总是基于运行时实际类型的动态调用
         */
        Person p = new Person("xiaoMing");
        Person s = new Student("xiaoStu");          // s: 声明类型Person，实际类型Student
        p.run();
        s.run();                                          // s.run():调用的是实际类型的run()方法--如果有Override的话

        System.out.println(p);

        System.out.println(p.hello());
        System.out.println(s.hello());

    }


}
