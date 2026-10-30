public class SolutionQ4 {
    private int[] data;
    private int front;
    private int size;
    private int capacity;

    public SolutionQ4(int k) {
        capacity = k;
        data = new int[k];
        front = 0; 
        size = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        int avail = (front + size) % capacity;
        data[avail] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false; 
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }

    public int Front() {
        if (isEmpty()) {
            return -1; // [7]
        }
        return data[front];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        int rearIndex = (front + size - 1) % capacity;
        return data[rearIndex];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }

}
