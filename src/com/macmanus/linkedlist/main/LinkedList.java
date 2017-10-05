package com.macmanus.linkedlist.main;

public class LinkedList<T>{

    //Head is the first element in the list
    private Node<T> head;

    //This is the last element in the list
    private Node<T> tail;

    private int size;

    public void add(T element){
        addLast(element);
    }

    public void add(int index, T element){
        if(index <= 0){
            addFirst(element);
        }
        else if(index >= size){
            addLast(element);
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
        while(ctr < index){
            current = current.getNext();
            ctr++;
        }

        return (T) current.getData();
    }

    public int size(){
        return size;
    }

    public T remove(int index){
        if(index >= size || index < 0){
            return null;
        }
        else if(index == 0){
            size--;
            return (T) removeHeadAndReturnCopy().getData();
        }
        else if(index == size -1){
            size--;
            return (T) removeTailAndReturnCopy().getData();
        }
        else {
            int ctr = 0;

            Node nodeToRemove = head;
            while (ctr < index && nodeToRemove.getNext() != null) {
                System.out.println("ctr: " + ctr + "  Node: " + nodeToRemove.toString());
                nodeToRemove = nodeToRemove.getNext();
                ctr++;
            }
            size--;
            return (T) removeNode(nodeToRemove).getData();
        }
    }

    public T remove (T element){
        if(head.getData().equals(element)){
            Node headCpy = head;
            head = head.getNext();
            return (T) headCpy.getData();
        }
        else if(tail.getData().equals(element)){
            Node tailCpy = tail;
            tail = tail.getLast();
            return (T) tailCpy.getData();
        }
        else {
            Node<T> nodeToRemove = head;
            while (!nodeToRemove.getData().equals(element)) {
                if (nodeToRemove == null) {
                    return null;
                }
                else{
                    nodeToRemove = nodeToRemove.getNext();
                }
            }
            removeNode(nodeToRemove);
            return nodeToRemove.getData();
        }

    }

    public T removeFirst(){
        size--;
        return (T) removeHeadAndReturnCopy().getData();
    }

    public T removeLast(){
        size--;
        return (T) removeTailAndReturnCopy().getData();
    }

    public void set(int index, T element){
        if (index <= 0) {
            head.setData(element);
        }
        else if (index >= size) {
            tail.setData(element);
        }
        else {
            setNodeAtIndex(index, element);
        }
    }

    public Node<T> getHead(){
        return head;
    }

    public void addFirst(T element){
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
        size++;
    }

    public void addLast(T element){
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
        size++;
    }

    private void addAtIndex(int  index, T element){
        int ctr = 0;
        Node nodeAtIndex = head;
        Node newNode = new Node<T>(element);
        while(ctr < index){
            nodeAtIndex = nodeAtIndex.getNext();
            ctr++;
        }

        Node nodeBeforeIndex = nodeAtIndex.getLast();
        nodeBeforeIndex.setNext(newNode);
        nodeAtIndex.setLast(newNode);
        newNode.setLast(nodeBeforeIndex);
        newNode.setNext(nodeAtIndex);
    }

    private Node removeNode(Node<T> nodeToRemove){
        System.out.println(nodeToRemove);
        Node temp = nodeToRemove;

        Node last = nodeToRemove.getLast();
        Node next = nodeToRemove.getNext();

        last.setNext(next);
        next.setLast(last);

        nodeToRemove.setLast(null);
        nodeToRemove.setNext(null);
        nodeToRemove = null;
        size--;
        return nodeToRemove;
    }

    private void setNodeAtIndex(int index, T element){
        if(index >= size){
            return;
        }

        int ctr = 0;
        Node nodeToBeSet = head;

        while (ctr != index) {
            nodeToBeSet = nodeToBeSet.getNext();
        }

        nodeToBeSet.setData(element);

    }

    private Node removeHeadAndReturnCopy(){
        Node tempHead = head;
        if(size > 1){
            head = head.getNext();
        }
        else{
            head = tail = null;
        }
        return tempHead;
    }

    private Node removeTailAndReturnCopy(){
        Node tempTail = tail;
        if(size > 1){
            tail = tail.getNext();
        }
        else{
            head = tail = null;
        }
        return tempTail;
    }
}