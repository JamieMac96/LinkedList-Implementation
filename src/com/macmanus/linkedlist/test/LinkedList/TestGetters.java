package com.macmanus.linkedlist.test.LinkedList;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestGetters {
    private LinkedList<String> list;

    @BeforeEach
    void setUp(){
        list = new LinkedList<>();

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
    }

    @Test
    public void testGet(){
        assertTrue(list.get(0).equals("LONGSTRING123"));
        assertTrue(list.get(5).equals("keyboard"));
        assertTrue(list.get(12).equals("words"));
    }

    @Test
    public void testGetFirst(){
        assertTrue(list.getFirst() == "LONGSTRING123");
    }

    @Test
    public void testGetLast(){
        assertTrue(list.getLast() == "words");
    }
}
