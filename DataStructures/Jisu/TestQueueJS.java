package Jisu;

import java.util.NoSuchElementException;

class JSQueue<T> {
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node (T data) {
            this.data = data;
        }
    }
    private Node<T> first;
    private Node<T> last;

    public void add(T item){
        Node<T> node = new Node<>(item);
        if (last != null){
            last.next = node;
        }
        last = node;

        if(first == null){
            first = last;
        }
    }
    public T remove(){
        if (first == null) throw new NoSuchElementException();
        T item = first.data;
        first = first.next;

        if (first == null) last = null;
        return item;
    }
    public T peek(){
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }
    public boolean isEmpty(){
        return first == null;
    }
}

public class TestQueueJS {
    public static void main(String[] args){
        JSQueue<Integer> queue = new JSQueue<>();
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
    }
}
