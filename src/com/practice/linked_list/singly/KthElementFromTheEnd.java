package com.practice.linked_list.singly;

public class KthElementFromTheEnd {

    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(8);
        linkedList.insertFirst(17);
        linkedList.insertLast(81);
        linkedList.insertAtNPosition(2, 55);
        linkedList.display();

        int k =1;
        System.out.println();
        System.out.println(linkedList.getKthNodeFromEnd(1));
    }

}
