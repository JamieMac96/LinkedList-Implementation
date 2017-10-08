package com.macmanus.linkedlist.test;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.jupiter.api.Test;

public class TestAdders {
    @Test
    public void testAddItems(){
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(700000);
        list.add(35);
        list.add(11);
        list.add(7667);

        assert(list.size() == 5);
        assert(list.getFirst() == 1);
        assert(list.getLast() == 7667);
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

        assert(list.size() == 3);
        assert(list.getFirst() == 411);
        assert(list.get(2) == 7667);
    }
}
