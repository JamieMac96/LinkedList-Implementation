package com.macmanus.linkedlist.test.LinkedList;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestClear {

    @Test
    public void testClear(){
        LinkedList<Double> list = new LinkedList<>();

        list.add(1.1);
        list.add(3.2);
        list.add(5.3);
        list.addFirst(3.6);
        list.addLast(4.4);

        list.clear();

        assertTrue(list.getFirst() == null);
        assertTrue(list.getLast() == null);
    }
}
