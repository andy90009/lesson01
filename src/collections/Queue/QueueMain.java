package collections.Queue;

/**
 * @author Liaohaibo
 * @date 2018/10/30 下午11:28
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 *  Queue<E> 实现了一个先进先出的队列
 *  1. LinkedList 实现了Queue<E>接口
 *  2. 获取队列长度 size()
 *  3. 添加元素到队尾 boolean add(E e)/boolean offer(E e)
 *  4. 获取队列头部元素并删除 E remove()/E poll()
 *  5. 获取队列头部元素并不删除 E element()/E peek()
 *
 */

public class QueueMain {

    public static void main(String[] args) {

        Queue<Person> queue = new LinkedList<>();
        queue.offer(new Person("xiaoMing",12));
        queue.offer(new Person("xiaoHong",14));
        queue.offer(new Person("xiaoJun",16));
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        if( !queue.isEmpty()) {
            System.out.println(queue.remove());
        }

    }
}
