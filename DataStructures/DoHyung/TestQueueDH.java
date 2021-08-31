package DoHyung;

import java.util.NoSuchElementException;

class QueueDH<T> {
    class NodeDH<T> {
        private T data;
        private NodeDH next;

        public NodeDH(T data) {
            this.data = data;
        }
    }

    private NodeDH<T> head;
    private NodeDH<T> tail;

    public void add(T data) {
        NodeDH<T> newNode = new NodeDH<T>(data);
        if (head == null) {
            head = newNode;
        }

        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;
    }

    public T remove() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        T item = head.data;
        head = head.next;
        return item;
    }

    public T peek() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        return head.data;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
public class TestQueueDH {
    public static void main(String[] args) {
        QueueDH<Integer> queue = new QueueDH<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());
        System.out.println(queue.remove());
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
    }
}
