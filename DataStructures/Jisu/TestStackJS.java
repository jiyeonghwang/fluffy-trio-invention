package Jisu;

import java.util.EmptyStackException;

class JSStack<T> {
    class Node<T> {
        private T data;
        private Node<T> next;

        public Node (T data) {
            this.data = data;
        }
    }
    private Node<T> top;

    public T pop(){
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }
    public void push(T item){
        Node<T> node = new Node<>(item);
        node.next = top;
        top = node;
    }
    public T peek(){
        if (top == null) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}

public class TestStackJS {
    public static void main(String[] args){
        JSStack<Integer> stack = new JSStack<>();
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
    }
}
