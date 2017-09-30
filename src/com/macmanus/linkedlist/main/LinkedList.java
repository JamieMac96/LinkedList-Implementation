package com.macmanus.linkedlist.main;

public class LinkedList<T>{

    private Node<T> first;

    public boolean add(T element){
        return false;
    }

    public boolean add(int index, T element){
        return false;
    }

    public boolean clear(){
        return false;
    }

    public T get(int index){
        return (T) new Object();
    }

    public int size(){
        return 0;
    }

    public T remove(int index){
        return (T) new Object();
    }

    public T remove (T element){
        return element;
    }

    public T set(int index, T element){
        return element;
    }
}