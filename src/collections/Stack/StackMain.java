package collections.Stack;

/**
 * @author Liaohaibo
 * @date 2018/10/31 上午11:05
 */

/**
 *  Stack 栈
 *  1. Stack 栈是一种后进先出的数据结构(LIFO)
 *  2. 2个重要的方法
 *     push(E e) 用于把元素压栈
 *     pop(E e) 用于把栈顶的元素弹出
 *  3. Java中没有单独Stack的接口，这是因为有一个遗留的接口叫Stact，为了兼容性
 *  4. 使用Deque实现Stack功能
 *     push(E e) : addFirst(E e)
 *     pop(E e) : removeFirst()
 *     peek(E e) : peekFirst()
 */
public class StackMain {
}
