package fansheAndfanxing.useAnnotation;

/**
 * @author Liaohaibo
 * @date 2018/10/29 下午11:40
 */
public class annotationMain {

    /**
     *  Annotation 注解：
     *  1. 注解本身不影响代码逻辑
     *  2. 如何使用注解由工具决定，例如，编译器
     *  3. 注解可以配置参数，没有指定配置的参数值使用默认值
     *  4. 如果参数名是value，可以省略参数名称
     */

    /**
     *  编译器使用的注解
     *  1. @Override: 让编译器检查该方法是否正确覆盖
     *  2. @Deprecated: 告诉该方法已经标记为作废，在其他地方引用会出现编译警告
     *  3. @SuppressWarnings: 忽略编译警告
     */

    @Deprecated
    public static void hello() {
        //
    }

    public static void main(String[] args) {

        Class cls = annotationMain.class;
        annotationMain.hello();
    }
}
