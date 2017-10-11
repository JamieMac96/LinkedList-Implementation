package com.macmanus.test.Node;

import com.macmanus.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestNode {

    @Test
    public void testSetNext(){
        Node<String> node = new Node<String>("hello");

        node.setNext(new Node<String>("mate"));

        assertTrue(node.getNext().getData().equals("mate"));
    }

    @Test
    public void testSetLast(){
        Node<Double> node = new Node<>(1.1);

        node.setLast(new Node<Double>(3.2));

        assertTrue(node.getLast().getData() == 3.2);
    }

    @Test
    public void testGetData(){
        Node<Double> node = new Node<>(1.1);

        double result = node.getData();

        assertTrue(result == 1.1);
    }

    @Test
    public void testGetNext(){
        Node<Integer> node = new Node<>(32);
        node.setNext(new Node<Integer>(54));

        double result = node.getNext().getData();

        assertTrue(result == 54);
    }

    @Test
    public void testGetLast(){
        Node<String> node = new Node<>("there");
        node.setLast(new Node<String>("hello"));

        String result = node.getLast().getData();

        assertTrue(result.equals("hello"));
    }
}
