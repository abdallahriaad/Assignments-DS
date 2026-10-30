
public class ArrayStack<E> implements Stack<E> {

    private E[] data;
    private int t = -1;

    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return t + 1;
    }

    public boolean isEmpty() {
        return t == -1;
    }

    public void push(E e) {
        if (size() == data.length) {
            throw new IllegalStateException("Full");
        }
        data[++t] = e;
    }

    public E top() {
        return isEmpty() ? null : data[t];
    }

    public E pop() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
}
