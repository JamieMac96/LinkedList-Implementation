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

    public void clear(){
        Node n = head.getNext();
        head.setNext(null);
        head = null;
        while(n != null){
            Node next = n.getNext();
            n.setLast(null);
            n.setNext(null);
            n = null;
            n = next;
        }

        this.head = null;
        this.tail = null;
        size = 0;
    }

    public T get(int index){
        if(head == null){
            return null;
        }

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

    public void remove(int index){
        if(index >= size || index < 0){
            return;
        }

        int ctr = 0;

        Node nodeToRemove = head;
        while(ctr < index){
            nodeToRemove = nodeToRemove.getNext();
        }
        removeNode(nodeToRemove);
    }

    public void remove (T element){

        if(head.getData().equals(element)){
            removeNode(head);
        }
        else if(tail.getData().equals(element)){
            removeNode(tail);
        }
        else {
            Node<T> nodeToRemove = head;
            while (!nodeToRemove.getData().equals(element)) {
                if (nodeToRemove == null) {
                    return;
                }
                else{
                    nodeToRemove = nodeToRemove.getNext();
                }
            }
            removeNode(nodeToRemove);
        }
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

    private void removeNode(Node<T> nodeToRemove){
        Node last = nodeToRemove.getLast();
        Node next = nodeToRemove.getNext();

        last.setNext(next);
        next.setLast(last);

        nodeToRemove.setLast(null);
        nodeToRemove.setNext(null);
        nodeToRemove = null;
    }
}