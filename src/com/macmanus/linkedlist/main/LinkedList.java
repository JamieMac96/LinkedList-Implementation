package com.macmanus.linkedlist.main;

public class LinkedList<T>{

    //Head is the first element in the list
    private Node<T> head;

    //This is the last element in the list
    private Node<T> tail;

    private int size;

    public void add(T element){
        addEnd(element);
        size++;
    }

    public void add(int index, T element){
        if(index <= 0){
            addStart(element);
        }
        else if(index >= size){
            addEnd(element);
        }
        else{
            addAtIndex(index, element);
        }
        size++;
    }

    public boolean clear(){
        return false;
    }

    public T get(int index){
        int ctr = 0;
        Node current = head;
        for(int i = 0; i < index; i++){
            current = current.getNext();
        }

        return (T) current.getData();
    }

    public int size(){
        return size;
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

    public Node<T> getHead(){
        return head;
    }

    private void addEnd(T element){
        Node newNode = new Node<T>(element);

        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.setLast(tail);
            tail.setNext(newNode);
            tail=newNode;
        }
    }

    private void addStart(T element){
        Node newNode = new Node<T>(element);

        if(tail == null){
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.setNext(head);
            head.setLast(newNode);
            head=newNode;
        }
    }

    private void addAtIndex(int  index, T element){
        int ctr = 0;
        Node nodeAtIndex = head;
        Node newNode = new Node<T>(element);
        while(ctr < index){
            nodeAtIndex = nodeAtIndex.getNext();
            ctr++;
        }
        //This block of code changes the references so that
        // -newNode is at 'index'.
        // -nodeAtIndex is shifted up one place
        // -NodeBeforeIndex sets its 'next' node to the newNode added.
        Node nodeBeforeIndex = nodeAtIndex.getLast();
        nodeBeforeIndex.setNext(newNode);
        nodeAtIndex.setLast(newNode);
        newNode.setLast(nodeBeforeIndex);
        newNode.setNext(nodeAtIndex);
    }
}