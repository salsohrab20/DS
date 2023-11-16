package com.practice.linked_list.circular;

public class Main {
    public static void main(String[] args) {
        CLL circularLinkedList = new CLL();
        circularLinkedList.insertLast(23);
        circularLinkedList.insertLast(3);
        circularLinkedList.insertLast(19);
        circularLinkedList.insertLast(75);
        circularLinkedList.display();
        System.out.println();
        circularLinkedList.displayFromTail();
    }
}
