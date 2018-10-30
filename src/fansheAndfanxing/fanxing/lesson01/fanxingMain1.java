package fansheAndfanxing.fanxing.lesson01;

import java.util.ArrayList;

/**
 * @author Liaohaibo
 * @date 2018/10/29 下午11:02
 */
public class fanxingMain1 {

    /**
     *  泛型
     *  ArrayList<T>,表示一种模板，T可以是String、Integer、Person、任意Class。
     *  ArrayList<String> strList = new ArrayList<String>();
     *  编译器将对类型作检查，我们传入的参数只能是String，否则报错
     */

    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("hello");
        strList.add("abc");
        //strList.add(123); 报错
        System.out.println(strList);
    }

    /**
     *  注意泛型的继承关系
     *  1. 可以把ArrayList<Integer>向上转型为List<Integer> T不能变
     *  2. 不能把ArrayList<Integer>向上转型为List<Number>
     */
}
