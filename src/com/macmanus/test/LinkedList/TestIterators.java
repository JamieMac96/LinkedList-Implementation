package com.macmanus.test.LinkedList;


import com.macmanus.linkedlist.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TestIterators {
    private String[] data;
    private LinkedList<String> list;
    private Iterator it;
    private int ctr;

    @BeforeEach
    void setUp(){
        data = new String[]{"hello", "this", "is", "for", "testing", "purposes", "lad"};
        list = new LinkedList<>();

        list.add("hello");
        list.add("this");
        list.add("is");
        list.add("for");
        list.add("testing");
        list.add("purposes");
        list.add("lad");

        it = list.iterator();
        ctr = 0;
    }

    @Test
    void testIterator(){

        while (it.hasNext()) {
            String item = (String)it.next();
            assertEquals(item, data[ctr]);
            ctr++;
        }

        ctr = 0;
    }

    @Test
    void testForEach(){
        for(String item: list){
            assertEquals(item, data[ctr]);
            ctr++;
        }
    }
}
