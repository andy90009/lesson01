package collections.Iterator;

import java.util.Iterator;

/**
 * @author Liaohaibo
 * @date 2018/10/31 下午2:55
 */
public class ReadOnlyList<E> implements Iterable<E> {

    E array[];

    public ReadOnlyList(E... array) {
        this.array = array;
    }

    @Override
    public Iterator<E> iterator() {
        return new ReadOnlyIterator();
    }

    class ReadOnlyIterator implements Iterator<E> {

        int index = 0;

        @Override
        public boolean hasNext() {
            return index < ReadOnlyList.this.array.length;
        }

        @Override
        public E next() {
            E e = array[index];
            index++;
            return e;
        }
    }
}
