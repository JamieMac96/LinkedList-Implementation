package com.macmanus.linkedlist.main;

public class UseList {
    public static void main(String [] args){
        LinkedList<String> myStrings = new LinkedList<String>();

        myStrings.add("Hello");
        myStrings.add("This");
        myStrings.add("Is");
        myStrings.add("A");
        myStrings.add("New");
        myStrings.add("List");

        for(int i = 0; i < myStrings.size(); i++){
            System.out.println(myStrings.get(i));
        }

        System.out.println("\n\nRecommended method: ");

        myStrings.add(2, "sdjdfnsjkdfbsdfsdfj");

        Node<String> current = myStrings.getHead();
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }

        myStrings.clear();

        System.out.println("\nAfter clearing:");

        for(int i = 0; i < myStrings.size(); i++){
            System.out.println(myStrings.get(i));
        }
    }
}
