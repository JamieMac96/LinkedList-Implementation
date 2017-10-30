package com.macmanus.test.LinkedList;

import com.macmanus.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestEquals {
    private LinkedList<String> list;
    private LinkedList<String> list2;

    @BeforeEach
    void setUp(){
        list = new LinkedList<>();
        list2 = new LinkedList<>();

        list.add("LONGSTRING123");
        list.add("paper");
        list.add("blah");
        list.add("haha");
        list.add("jeff");
        list.add("keyboard");
        list.add("com/macmanus/test");
        list.add("cat");
        list.add("phone");
        list.add("com/macmanus/test");
        list.add("mouse");
        list.add("string");
        list.add("words");

        list2.add("LONGSTRING123");
        list2.add("paper");
        list2.add("blah");
        list2.add("haha");
        list2.add("jeff");
        list2.add("keyboard");
        list2.add("com/macmanus/test");
        list2.add("cat");
        list2.add("phone");
        list2.add("com/macmanus/test");
        list2.add("mouse");
        list2.add("string");
        list2.add("words");
    }

    @Test
    void testEquals(){
        assertTrue(list.equals(list2));
    }
}
