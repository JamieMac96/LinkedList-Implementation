package com.macmanus.linkedlist.test;

import com.macmanus.linkedlist.main.LinkedList;
import org.junit.jupiter.api.Test;

public class TestGetters {

    @Test
    public void TestGet(){
        LinkedList<String> list = new LinkedList<>();

        assert();


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


        assert(list.get(0).equals("LONGSTRING123"));
        assert(list.get(5).equals("keyboard"));
        assert(list.get(2).equals("blah"));
    }

    @Test
    public void testGetFirst(){
        LinkedList<String> list = new LinkedList<>();

        assert(list.getFirst() == null);

        list.add("phone");
        list.add("test");
        list.add("mouse");
        list.add("string");
        list.add("words");
    }


}
