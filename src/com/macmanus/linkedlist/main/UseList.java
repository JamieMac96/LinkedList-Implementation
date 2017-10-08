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

        myStrings.add(2, "sdjdfnsjkdfbsdfsdfj");

        System.out.println("\n\nAfter adding: ");

        Node<String> current = myStrings.getHead();
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }

        myStrings.remove(0);
        String returnString = myStrings.remove("List");
        System.out.println("return from remove: " + returnString);

        System.out.println("\nAfter removing:");

        for(int i = 0; i < myStrings.size(); i++){
            System.out.println(myStrings.get(i));
        }
    }
}
