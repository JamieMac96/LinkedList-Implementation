package com.macmanus.linkedlist.test;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.jupiter.api.Test;

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

        assert(list.getFirst() == null);
        assert(list.getLast() == null);
    }
}
