package collections.Iterator;

/**
 * @author Liaohaibo
 * @date 2018/10/31 上午11:24
 */

/**
 *  Java的很多集合类都可以使用for...each循环
 *  List,Set,Queue,Deque,
 *
 *  List<String> list = ...
 *  for(String s : list) {
 *
 *  }
 *  实际上编译器会通过iterator自动改写为：
 *  List<String> list = ...
 *  for(Iterator<String> it = list.iterator;it.hasNext();) {
 *      String s = it.next();
 *  }
 *
 *  如果我们自己编写的集合类也希望编译器能够直接使用for...each循环，则要满足一下几点：
 *  1. 实现Iterable接口
 *  2. Iterator方法,返回Iterator对象
 *  3. 用Iterator对象迭代
 *
 *  编写Iterator时，通常使用一个内部类来实现Iterator接口，这个内部类可以直接访问对应外部类的所有字段和方法
 *  public class ReadOnlyList<E> implements Iterable<E> {
 *      E array[];
 *
 *      public ReadOnlyList(E... array) {
 *          this.array = array;
 *      }
 *
 *      public Iterator<E> iterator() {
 *          return new ReadOnlyIterator();
 *      }
 *
 *      class ReadOnlyIterator implements Iterator<E> {
 *          ReadOnlyList.this.array.length;
 *      }
 *      ...
 *
 *  }
 */

/**
 * Iterator 迭代对象
 * 1.
 */

public class IteratorMain {

    public static void main(String[] args) {

        ReadOnlyList<String> list = new ReadOnlyList<>("apple","orange","city");
        for(String s : list) {
            System.out.println(s);
        }

    }

}
