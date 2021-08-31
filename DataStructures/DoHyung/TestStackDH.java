package DoHyung;

import java.util.EmptyStackException;

class StackDH<T> {
    class NodeDH<T> {
        private T data;
        private NodeDH<T> next;

        public NodeDH(T data) {
            this.data = data;
        }
    }

    private NodeDH<T> top;

    public void push(T data) {
        NodeDH<T> newNode = new NodeDH<T>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public T peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class TestStackDH {
    public static void main(String[] args) {
        StackDH<Integer> stack = new StackDH<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
    }
}


