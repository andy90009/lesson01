package collections.Queue.PriorityQueue;

/**
 * @author Liaohaibo
 * @date 2018/10/31 上午9:59
 */


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * PriorityQueue(优先级队列)
 * 1. PriorityQueue<E>的出队顺序与优先级有关
 * 2. remove() / poll()总是取出优先级最高的元素出队
 * 3. PriorityQueue <E>具有Queue<E>的接口：
 *    public class PriorityQueue<E> implements Queue<E>{
 *
 *        总是返回优先级最高的元素
 *        boolean add(E e) / boolean offer(E e) 添加元素到d队列尾部
 *        E remove(E e) / E poll(E e) 获取头部元素并删除
 *        E element(E e) / E peek(E e) 获取头部元素并不删除
 *
 *    }
 * 4. 默认按元素比较时，该数据类型必须实现Comparable接口
 * 5. 可以通过Comparator实现自定义排序算法(不必实现Compraable接口)
 */
public class PriorityQueueMain {

    public static void main(String[] args) {

        Queue<Person> queue = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return - o1.getName().compareTo(o2.getName());
            }
        });
        queue.add(new Person("Ming",12));
        queue.add(new Person("Hong",14));
        queue.add(new Person("Jun",16));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

    }

}
