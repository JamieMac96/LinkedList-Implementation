package com.macmanus.linkedlist.test.LinkedList;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSetters {

    @Test
    public void testSetFirst(){
        LinkedList<Double> list = new LinkedList<>();

        list.add(1.1);
        list.add(3.2);
        list.add(5.3);
        list.add(3.6);
        list.add(4.4);

        list.set(0, 2.2);

        assertEquals(2.2, (double)list.getFirst());
    }

    @Test
    public void testSetLast(){
        LinkedList<Double> list = new LinkedList<>();

        list.add(1.1);
        list.add(3.2);
        list.add(5.3);
        list.add(3.6);
        list.add(4.4);

        list.set(4, 2.2);

        assertEquals(2.2, (double)list.getLast());
    }

    @Test
    public void TestSetMiddleElement(){
        LinkedList<Double> list = new LinkedList<>();

        list.add(1.1);
        list.add(3.2);
        list.add(5.3);
        list.add(3.6);
        list.add(4.4);

        list.set(2, 12.5);

        assertEquals(12.5, (double)list.get(2));
    }
}
