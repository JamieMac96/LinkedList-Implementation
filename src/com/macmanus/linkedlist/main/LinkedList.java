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

    public void add(int index, T element) throws IndexOutOfBoundsException{
        checkIndexAdd(index);

        if(index == 0){
            addFirst(element);
        }
        else if(index == size){
            addLast(element);
        }
        else{
            addAtIndex(index, element);
        }
    }

    public void addFirst(T element){
        Node<T> newNode = new Node<T>(element);

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
        Node<T> newNode = new Node<T>(element);

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

    public T get(int index) throws IndexOutOfBoundsException{

        checkIndex(index);

        if(head == null){
            return null;
        }

        int ctr = 0;
        Node<T> current = head;

        while(ctr < index){
            current = current.getNext();
            ctr++;
        }

        return current.getData();
    }

    public T getFirst(){
        if(head != null){
            return head.getData();
        }
            return null;
    }

    public T getLast(){
        if(tail != null){
            return tail.getData();
        }
            return null;
    }

    public T remove(int index) throws IndexOutOfBoundsException{
        checkIndex(index);

        if(index == 0){
            size--;
            return removeHeadAndReturnCopy().getData();
        }
        else if(index == size -1){
            size--;
            return removeTailAndReturnCopy().getData();
        }

        int ctr = 0;
        Node<T> nodeToRemove = head;

        while (ctr < index && nodeToRemove.getNext() != null) {
            nodeToRemove = nodeToRemove.getNext();
            ctr++;
        }

        return removeNode(nodeToRemove).getData();
    }

    public T remove (T element){
        if(head.getData().equals(element)){
            return removeFirst();
        }
        else if(tail.getData().equals(element)){
            return removeLast();
        }
        else {
            Node<T> nodeToRemove = head;
            while (!nodeToRemove.getData().equals(element)) {
                if (nodeToRemove == null) {
                    return null;
                }
                nodeToRemove = nodeToRemove.getNext();
            }
            Node<T> temp = removeNode(nodeToRemove);
            return temp.getData();
        }

    }

    public T removeFirst(){
        size--;
        return removeHeadAndReturnCopy().getData();
    }

    public T removeLast(){
        size--;
        return removeTailAndReturnCopy().getData();
    }

    public void set(int index, T element) throws IndexOutOfBoundsException{
        checkIndex(index);

        if (index == 0) {
            head.setData(element);
        }
        else if (index == size - 1) {
            tail.setData(element);
        }
        else {
            setNodeAtIndex(index, element);
        }
    }

    public int size(){
        return size;
    }

    public void clear(){
        Node<T> n = head.getNext();
        head.setNext(null);
        head = null;

        while(n != null){
            Node<T> next = n.getNext();
            n.setLast(null);
            n.setNext(null);
            n = null;
            n = next;
        }
        n = null;
        this.head = null;
        this.tail = null;
        size = 0;
    }

    @Override
    public String toString(){
        String output = "[";
        Node<T> currentNode = head;

        while(currentNode != null){
            if(currentNode == tail){
                output += tail.getData() + "]";
                currentNode = null;
            }
            else{
                output += currentNode.getData() + ", ";
                currentNode = currentNode.getNext();
            }
        }

        return output;
    }

    private void addAtIndex(int  index, T element){
        int ctr = 0;
        Node<T> nodeAtIndex = head;
        Node<T> newNode = new Node<T>(element);

        while(ctr < index){
            nodeAtIndex = nodeAtIndex.getNext();
            ctr++;
        }

        Node<T> nodeBeforeIndex = nodeAtIndex.getLast();
        nodeBeforeIndex.setNext(newNode);
        nodeAtIndex.setLast(newNode);
        newNode.setLast(nodeBeforeIndex);
        newNode.setNext(nodeAtIndex);
        size++;
    }

    private Node<T> removeNode(Node<T> nodeToRemove){
        Node<T> temp = nodeToRemove;

        Node<T> last = nodeToRemove.getLast();
        Node<T> next = nodeToRemove.getNext();

        last.setNext(next);
        next.setLast(last);

        nodeToRemove.setLast(null);
        nodeToRemove.setNext(null);
        nodeToRemove = null;
        size--;
        return temp;
    }

    private void setNodeAtIndex(int index, T element) throws IndexOutOfBoundsException{
        checkIndex(index);

        int ctr = 0;
        Node<T> nodeToBeSet = head;

        while (ctr < index) {
            nodeToBeSet = nodeToBeSet.getNext();
            ctr++;
        }

        nodeToBeSet.setData(element);
    }

    private Node<T> removeHeadAndReturnCopy(){
        Node<T> tempHead = head;

        if(size > 1){
            head = head.getNext();
        }
        else{
            head = tail = null;
        }

        return tempHead;
    }

    private Node<T> removeTailAndReturnCopy(){
        Node<T> tempTail = tail;

        if(size > 1){
            tail = tail.getLast();
        }
        else{
            head = tail = null;
        }

        return tempTail;
    }

    private void checkIndex(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index: "
                    + index
                    + " Size: "
                    + size);
        }
    }

    private void checkIndexAdd(int index) throws IndexOutOfBoundsException{
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: "
                    + index
                    + ", Size: "
                    + size);
        }
    }
}