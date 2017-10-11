package com.macmanus.test.LinkedList;

import com.macmanus.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAdders {
    private LinkedList<Integer> list;

    @BeforeEach
    void setUp(){
        list = new LinkedList<Integer>();
        list.add(1);
        list.add(700000);
        list.add(35);
        list.add(11);
        list.add(7667);

        assertTrue(list.size() == 5);
    }

    @Test
    void testAddItems(){
        assertTrue(list.size() == 5);
        assertTrue(list.getFirst() == 1);
        assertTrue(list.getLast() == 7667);
    }

    @Test
    void testAddItemsAtIndex(){
        assertTrue(list.size() == 5);
        assertTrue(list.getFirst() == 1);
        assertTrue(list.get(3) == 11);
    }
}
