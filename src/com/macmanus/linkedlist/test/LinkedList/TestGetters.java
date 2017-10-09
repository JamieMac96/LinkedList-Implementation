package com.macmanus.linkedlist.test.LinkedList;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestGetters {

    @Test
    public void testGet(){
        LinkedList<String> list = new LinkedList<>();


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


        assertTrue(list.get(0).equals("LONGSTRING123"));
        assertTrue(list.get(5).equals("keyboard"));
        assertTrue(list.get(12).equals("words"));
    }

    @Test
    public void testGetFirst(){
        LinkedList<String> list = new LinkedList<>();

        list.add("phone");
        list.add("test");
        list.add("mouse");
        list.add("string");
        list.add("words");

        assertTrue(list.getFirst() == "phone");
    }

    @Test
    public void testGetLast(){
        LinkedList<String> list = new LinkedList<>();

        list.add("jeff");
        list.add("test");
        list.add("computer");
        list.add("string");
        list.add("adrian");

        assertTrue(list.getLast() == "adrian");
    }
}
