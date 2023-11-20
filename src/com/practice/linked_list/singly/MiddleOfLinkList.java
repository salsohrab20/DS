package com.practice.linked_list.singly;

public class MiddleOfLinkList {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(8);
        linkedList.insertFirst(17);
        linkedList.insertLast(81);
        linkedList.insertAtNPosition(2, 55);
        linkedList.insertLast(94);
        linkedList.display();

        System.out.println();
        System.out.println(linkedList.middleOfLL(linkedList));
    }
}
