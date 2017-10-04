package com.macmanus.linkedlist.main;

public class Node<T> {
    private Node<T> next;
    private Node<T> last;
    private T data;

    public Node(T data){
        this.data = data;
    }

    public void setNext(Node<T> next){
        this.next = next;
    }

    public void setLast(Node<T> last){
        this.last = last;
    }

    public Node<T> getNext(){
        return next;
    }

    public Node<T> getLast(){
        return last;
    }

    public T getData(){
        return data;
    }
}
