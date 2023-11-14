package com.practice.linked_list;

public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(8);
        linkedList.insertFirst(17);
        linkedList.insertLast(81);
        linkedList.insertAtNPosition(3,17);
        linkedList.display();

    }
}
