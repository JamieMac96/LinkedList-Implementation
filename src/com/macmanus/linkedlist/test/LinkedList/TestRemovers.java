package com.macmanus.linkedlist.test.LinkedList;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestRemovers {
    @Test
    public void testRemoveItem(){
        LinkedList<String> list = new LinkedList<String>();

        list.add("LONGSTRING123");
        list.add("paper");
        list.add("blah");
        list.add("haha");
        list.add("jeff");
        list.add("keyboard");
        list.add("test");
        list.add("cat");
        list.add("phone");
        list.add("test");
        list.add("mouse");
        list.add("string");
        list.add("words");

        assertTrue(list.remove("paper").equals("paper"));
        assertTrue(list.remove("LONGSTRING123").equals("LONGSTRING123"));
        assertTrue(list.remove("words").equals("words"));
        assertTrue(list.size() == 10);
    }

    @Test
    public void testRemoveIndex(){
        LinkedList<Double> list = new LinkedList<>();

        list.add(1.1);
        list.add(3.2);
        list.add(5.3);
        list.add(3.6);
        list.add(4.4);
        list.add(3.9);
        list.add(12.4);

        assertTrue(list.remove(0) == 1.1);
        assertTrue(list.remove(3) == 4.4);
        assertTrue(list.remove(4) == 12.4);
        assertTrue(list.size() == 4);
    }

    @Test void testRemoveFirst(){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(700000);
        list.add(35);
        list.add(11);
        list.add(7667);
        list.add(12345);

        int result = list.removeFirst();

        assertTrue(result == 1);
        assertTrue(list.size() == 5);
    }

    @Test
    public void testRemoveLast(){
        LinkedList<Long> list = new LinkedList<>();

        list.add(1111111111111111111L);
        list.add(700000L);
        list.add(35L);
        list.add(11L);
        list.add(7667L);
        list.add(12345L);

        long result = list.removeLast();

        assertTrue(result == 12345L);
        assertTrue(list.size() == 5);
    }
}
