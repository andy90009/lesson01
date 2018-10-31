package collections.Set;

/**
 * @author Liaohaibo
 * @date 2018/10/30 下午9:49
 */


import java.util.*;

/**
 *  Set用于存储不重复的元素
 *  1. boolean add(E e)
 *  2. boolean remove(Object o)
 *  3. boolean contains(Object o)
 *  4. int Size()
 *  5. Set相当于不存储value，的Map
 *  6. Set去除重复元素
 *  7. 放入Set的元素要正确实现equals()和HashCode()方法
 *
 *  Set不保证有序
 *  1. HashSet 无序
 *  2. TreeSet 有序
 *  3. 实现SortedSet接口的 是有序的
 */

public class SetMain {

    static List<String> removeDuplicate(List<String> list) {
        Set<String> set = new TreeSet<>(list);
        return new ArrayList<String>(set);
    }

    public static void main(String[] args) {

        List<String> list1 = Arrays.asList("apple","orange","pear","apple","banana","orange");
        List<String> list2 = removeDuplicate(list1);
        System.out.println(list1);
        System.out.println(list2);
    }

}
