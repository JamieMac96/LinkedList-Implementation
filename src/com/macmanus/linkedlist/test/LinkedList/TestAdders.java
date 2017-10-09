package com.macmanus.linkedlist.test.LinkedList;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAdders {
    @Test
    public void testAddItems(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(700000);
        list.add(35);
        list.add(11);
        list.add(7667);

        assertTrue(list.size() == 5);
        assertTrue(list.getFirst() == 1);
        assertTrue(list.getLast() == 7667);
    }

    @Test
    public void testAddItemsAtIndex(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(0,1);
        list.add(1,700000);
        list.add(2,35);
        list.add(3,11);
        list.add(2,7667);
        list.add(0, 411);

        assertTrue(list.size() == 6);
        assertTrue(list.getFirst() == 411);
        assertTrue(list.get(3) == 7667);
    }
}
