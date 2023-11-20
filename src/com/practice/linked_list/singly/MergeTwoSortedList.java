package com.practice.linked_list.singly;

public class MergeTwoSortedList {
    public static void main(String[] args) {
        LL linkedList1 = new LL();
        linkedList1.insertFirst(3);
        linkedList1.insertFirst(2);
        linkedList1.insertFirst(8);
        linkedList1.insertFirst(17);
        linkedList1.insertLast(81);
        linkedList1.insertAtNPosition(2, 55);
        linkedList1.insertLast(94);

        LL linkedList2 = new LL();
        linkedList2.insertFirst(1);
        linkedList2.insertFirst(9);
        linkedList2.insertFirst(0);
        linkedList2.insertFirst(10);
        linkedList2.insertLast(87);
        linkedList2.insertAtNPosition(3, 98);
        linkedList2.insertLast(109);

        LL linkedList3= new LL().mergeTwoLinkedList(linkedList1,linkedList2);
        linkedList3.display();
    }
}

