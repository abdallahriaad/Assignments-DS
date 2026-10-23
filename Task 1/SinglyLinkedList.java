
public class SinglyLinkedList<E> {

    private class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E e, Node<E> n) {
            this.element = e;
            this.next = n;
        }

        public E getElement() {
            return this.element;
        }

        public void setElement(E e) {
            this.element = e;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E e) {
        head = new Node<>(e, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(E e) {
        Node<E> newest = new Node<>(e, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if (size == 0) {
            tail = null;
        }
        return answer;
    }

    /*
     *************************************AbdallahRiad - 120221864***********************************************
     */
    // Part B - Extend SinglyLinkedList  add to public E removeLast() 
    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E answer = tail.getElement();

        if (size == 1) {
            head = null;
            tail = null;
        } else {
            Node<E> tNext = head;
            while (tNext.getNext() != tail) {
                tNext = tNext.getNext();
            }
            tail = tNext;
            tail.setNext(null);
        }
        size--;
        return answer;
    }
}
