package com.practice.linked_list.singly;

import com.practice.linked_list.singly.LL;
public class Main {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(8);
        linkedList.insertFirst(17);
        linkedList.insertLast(81);
        linkedList.insertAtNPosition(3, 17);
        linkedList.insertAtNPosition(2, 55);
        linkedList.display();
        System.out.println();
        System.out.println(linkedList.deleteFirst());
        linkedList.display();
        System.out.println();
        System.out.println(linkedList.deleteLast());
        linkedList.display();
        System.out.println();
        System.out.println(linkedList.deleteFromIndex(3));
        linkedList.display();
        System.out.println();
        linkedList.reverse();
    }
}
