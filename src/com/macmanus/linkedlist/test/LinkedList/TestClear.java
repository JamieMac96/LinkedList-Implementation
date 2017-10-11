package com.macmanus.linkedlist.test.LinkedList;

import com.macmanus.linkedlist.main.LinkedList;
import com.macmanus.linkedlist.main.Node;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClear {
    private LinkedList<Double> list;

    @BeforeEach
    void setUp(){
        list = new LinkedList<>();
        list.add(1.1);
        list.add(3.2);
        list.add(5.3);
        list.addFirst(3.6);
        list.addLast(4.4);
    }

    @Test
    public void testClear(){
        list.clear();

        assertTrue(list.getFirst() == null);
        assertTrue(list.getLast() == null);
    }
}
