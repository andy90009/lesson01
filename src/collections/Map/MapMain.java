package collections.Map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Liaohaibo
 * @date 2018/10/30 下午2:27
 */
public class MapMain {

    /**
     *  Map
     *  Map是一种键-值(Key-Value)映射表, 可以通过Key快速查找Value(元素)
     *
     *  Map<K,V>是一种键-值(Key-Value) 映射表：
     *  1. V put(K key, V value): 把Key-Value放入Map
     *  2. V get(K key): 通过Key获取Value
     *  3. boolean containsKeys(K key): 判断Key是否存在
     *
     *  遍历Map:
     *  1.遍历Key可以使用for...each循环遍历KeySet()
     *  Map<String,Integer> map = ...
     *  for(String key: map.keySet()) {
     *      Integer value = map.get(key);
     *  }
     *
     *  2.同时遍历key，value可以使用for...each循环遍历entrySet()
     *  Map<String,Integer> map = ...
     *  for(Map.Entry<String,Integer> entry : map.entrySet()) {
     *      String key = entry.getKey();
     *      String value = entry.getValue();
     *  }
     *
     *  Map最常用的实现类HashMap, HashMap内部存储不保证有序：
     *  1. 遍历时的顺序不一定是put放入的顺序，也不一定是Key的排序顺序
     *
     *  需要对Key排序时使用treeMap
     *
     *  SortedMap
     *  排序只能作用于Key
     *  Map<String,Integer> map = new TreeMap();
     *  map.put("orange", 1);
     *  map.put("apple", 2);
     *  map.put("banana", 3);
     *  for(String key: map.keySet()) {
     *      System.out.println(key);
     *  }
     */

    /**
     * 正确使用Map必须保证：
     * 1. 作为Key对象必须正确覆写equals()方法
     * 2. 必须正确覆写hashCode()方法
     *  a.equals(b) == true, 则a.hashCode == b.hashCode
     */

    public static void main(String[] args) {

        List<Person> list = Arrays.asList(new Person("xiaoMing",12),new Person("xiaoHong",16),new Person("xiaoJun",18));
        System.out.println(list);
        Map<Person, String> map = new HashMap<>();
        for(Person p : list) {
            map.put(p, p.getName());
        }
//        for(Map.Entry<String,Person> entry : map.entrySet()) {
//            System.out.println(entry.getKey());
//            System.out.println(entry.getValue());
//        }
        System.out.println(map.get(new Person("xiaoMing",12)));   //这里调用的是Person类中覆写的toString()方法
    }
}
