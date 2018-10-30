package collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Liaohaibo
 * @date 2018/10/29 下午11:55
 */
public class ListMain {

    /**
     *  List<E>是一种有序链表
     *  1. List内部按照元素的先后顺序存放
     *  2. 每个元素都可以通过索引确定位置
     *  3. 类似数组，但大小可变
     *  4. 元素可以重复，可以是null
     *
     *  - 数组也是有序结构，但是大小固定，且删除元素时需要移动后续元素。
     *  - ArrayList<E>: 内部使用数组存储所有元素
     *  - LinkedList<E>: 内部每个元素都指向下一个元素
     *  -
     */

    /**
     *  方法：
     *  1. void add(E e): 在末尾添加一个元素
     *  2. void add(int index, E e) 在指定索引添加一个元素
     *  3. int remove(int index) 删除指定索引的元素
     *  4. int remove(Object e) 删除某个元素
     *  5. E get(int index) 获取指定位置的元素
     *  6. int size() 获取链表的大小 (包含元素的个数)
     */

    /**
     *  遍历一个List<E>:
     *  1. 使用get(index)
     *  2. 使用iterator<E>
     *  3. 使用forEach，最简单,所有实现Iterable接口的都可以用forEach遍历，编译器将3转换为2
     */

    /**
     *  把List<E>变为Array
     *  1. Object[] toArray()
     *  2. <T> T[] toArray(T[] a)
     *  通常我们使用 保证list的每个元素和array的每个元素以以对应
     *  Integer array[] = list.toArray(new Integer[list.size()])
     */

    /**
     *  把Array变为List<E>:
     *  1. <T> List<T> Arrays.asList(T... a) 返回的对象是List而不是ArrayList
     */

    /**
     *  List<E>是一种有序链表
     *  1. List内部按照放入元素的先后顺序存放
     *  2. 每个元素都可以通过索引确定位置
     *  3. boolean contains(Object o)是否包含某个元素
     *  4. int indexOf(Object o) 查找某个元素的索引，不存在返回-1
     *
     */

    /**
     * List中查找元素
     * 1. List的实现类通过元素的equals方法比较两个元素
     * 2. 放入的元素必须正确覆写equals方法，JDK提供的String、Integer已经覆写了equals方法
     * 3. 编写equals方法，可以借助Object.equals()判断
     * 4. 如果不在list中查找元素，不必覆写equals()方法
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Integer array[] = list.toArray(new Integer[5]);
        // String ss[] = list.toArray(new Integer[5]); 报错
        System.out.println(Arrays.toString(array));

        Integer arr1[] = {1,2,3};
        List<Integer> list1 = Arrays.asList(arr1);
        // 注意返回的list并不是ArrayList 不能调用add
        //list1.add(4);       // java.lang.UnsupportedOperationException
        //
        List<Integer> arrList = new ArrayList<>();
        arrList.addAll(list1);

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");

        System.out.println(list2.contains("C"));
        System.out.println(list2.contains("D"));
        System.out.println(list2.indexOf("A"));
        System.out.println(list2.indexOf("D"));

        List<Person> list3 = new ArrayList<>();
        list3.add(new Person("xiaoMing",12));
        list3.add(new Person("xiaoHong",16));
        list3.add(new Person("xiaoJun",18));

        System.out.println(list3.contains(new Person("xiaoJun",18)));

    }

}
