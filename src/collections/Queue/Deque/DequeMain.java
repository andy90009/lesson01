package collections.Queue.Deque;

/**
 * @author Liaohaibo
 * @date 2018/10/31 上午10:36
 */

import java.util.Deque;
import java.util.LinkedList;

/**
 * Deque<E>实现的是双端队列
 * 1. 既可以添加在队首，也可以添加在队尾
 * 2. 既可以从队首获取，也可以从队尾获取
 * public interface Deque<E> extends Queue<E> {}
 * 3. Deque的实现类 ArrayDeque, LinkedList
 * 4. 方法
 *    添加
 *    addFirst / offerFirst; addLast / offerLast
 *    删除(返回队首或队尾的元素)
 *    removeFirst / pollFirst; removeLast / pollLast
 *    不删除(返回队首或队尾的元素)
 *    getFirst / peekFirst; getLast / peekLast
 */



public class DequeMain {

    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();
        deque.offerLast("end"); // "end"
        deque.offerFirst("c");  // "c","end"
        deque.offerFirst("a");  // "a","c","end"
        deque.offerFirst("b");  // "b","a","c","end"
        System.out.println(deque.pollLast());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());

    }

}
