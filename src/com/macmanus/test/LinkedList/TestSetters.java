package com.macmanus.test.LinkedList;

import com.macmanus.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSetters {
    private LinkedList<Long> list;
    @BeforeEach
    void setUp(){
        list = new LinkedList<>();

        list.add(12345656666L);
        list.add(321L);
        list.add(1000000000000000000L);
        list.add(666L);
        list.add(6776L);
        list.add(4654L);
    }

    @Test
    public void testSetFirst(){
        list.set(0, 1321L);

        assertEquals(1321L, (long)list.getFirst());
    }

    @Test
    public void testSetLast(){
        list.set(5, 777L);

        assertEquals(777L, (long)list.getLast());
    }

    @Test
    public void TestSetMiddleElement(){
        list.set(2, 12L);

        assertEquals(12L, (long)list.get(2));
    }
}
