package com.macmanus.test.LinkedList;

import com.macmanus.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRemovers {
    private LinkedList<Double> list;

    @BeforeEach
    void setUp(){
        list = new LinkedList<>();

        list.add(1.1);
        list.add(3.2);
        list.add(5.3);
        list.add(3.6);
        list.add(4.4);
        list.add(3.9);
        list.add(12.4);

        assertTrue(list.size() == 7);
    }

    @Test
    void testRemoveItem(){
        assertTrue(list.remove(1.1).equals(1.1));
        assertTrue(list.remove(12.4).equals(12.4));
        assertTrue(list.remove(3.6).equals(3.6));
        assertTrue(list.size() == 4);
    }

    @Test
    void testRemoveIndex(){
        assertTrue(list.remove(0) == 1.1);
        assertTrue(list.remove(3) == 4.4);
        assertTrue(list.remove(4) == 12.4);
        assertTrue(list.size() == 4);
    }

    @Test
    void testRemoveFirst(){
        assertTrue(list.removeFirst() == 1.1);
        assertTrue(list.size() == 6);
    }

    @Test
    void testRemoveLast(){
        assertTrue(list.removeLast() == 12.4);
        assertTrue(list.size() == 6);
    }
}
