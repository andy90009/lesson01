package fansheAndfanxing.fanxing.lesson02;

import java.util.Arrays;

/**
 * @author Liaohaibo
 * @date 2018/10/29 下午11:19
 */
public class fanxingMain2 {

    public static void main(String[] args) {

        String strs[] = { "Apple", "Pear", "Orange" };
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));

        Student ss[] = { new Student("xiaoMing",59), new Student("xiaoHong",98), new Student("xiaoJun",78)};
        Arrays.sort(ss);    // Student必须实现 Comparable接口，才能排序
        System.out.println(Arrays.toString(ss));
    }
}
