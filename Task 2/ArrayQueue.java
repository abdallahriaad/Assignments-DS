
class ArrayQueue<E> implements Queue<E> {

    private E[] data;
    private int front = 0, size = 0;

    public ArrayQueue(int capacity) {
        data = (E[]) new Object[capacity];
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(E e) {
        if (this.size == data.length) {
            throw new IllegalStateException("Fullll!!!!");
        }
        int avail = (front + this.size) % data.length;
        data[avail] = e;
        this.size++;
    }

    public E first() {
        return isEmpty() ? null : data[front];
    }

    public E dequeue() {
        if (isEmpty()) {
            return null;
        }
        E answer = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        this.size--;
        return answer;
    }
}
