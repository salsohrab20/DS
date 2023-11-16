package com.practice.linked_list.doubly;

public class Main {
    public static void main(String[] args) {
        DLL doublyLinkedList = new DLL();
        doublyLinkedList.insertFirst(12);
        doublyLinkedList.insertFirst(24);
        doublyLinkedList.insertLast(23);
        doublyLinkedList.insertLast(91);
        doublyLinkedList.insertLast(32);
        doublyLinkedList.insertLast(42);
        doublyLinkedList.insertFirst(92);
        doublyLinkedList.insertAfter(24,65);
        doublyLinkedList.display();
        System.out.println();
        doublyLinkedList.reverse();
    }
}
