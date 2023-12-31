package com.practice.linked_list.singly;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void display() {/*
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.print("END ");*/
        displayUsingRecursion(head);
    }

    public void displayUsingRecursion(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        System.out.print(temp.value + "-> ");
        displayUsingRecursion(temp.next);
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAtNPosition(int position, int val) {
        if (position == size) {
            insertLast(val);
        }
        if (position == 0) {
            insertFirst(val);
        }
        Node temp = head;
        int index = 0;
        while (index < position - 1) {
            temp = temp.next;
            index++;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int deletedValue = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return deletedValue;
    }

    public int deleteLast() {
        if (size <= 1) {
            deleteFirst();
        }
        Node secondLast = getNode(size - 2);
        int deletedValue = tail.value;
        tail = secondLast;
        secondLast.next = null;
        return deletedValue;
    }

    public int deleteFromIndex(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if (index == size - 1) {
            deleteLast();
        }
        Node previous = getNode(index - 1);
        int deletedValue = previous.next.value;
        previous.next = previous.next.next;
        return deletedValue;
    }

    private Node getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void reverse() {
        reverseUsingRecursion(head);
    }

    private void reverseUsingRecursion(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        reverseUsingRecursion(temp.next);
        System.out.print(temp.value + "-> ");
    }

    public int getKthNodeFromEnd(int k) {
        Node fp = head;
        Node sp = head;
        for (int i = 1; i <= k; i++) {
            fp = fp.next;
        }
        while (fp != null) {
            sp = sp.next;
            fp = fp.next;
        }
        return sp.value;
    }

    public int middleOfLL(LL linkList) {
        Node fp = head;
        Node sp = head;
        while (fp.next != null && fp.next.next != null) {
            fp = fp.next.next;
            sp = sp.next;
        }
        return sp.value;
    }

    public LL mergeTwoLinkedList(LL linkList1, LL linkList2) {
        Node first = linkList1.head;
        Node second = linkList2.head;
        LL res = new LL();
        while (first != null && second != null) {
            if(first.value< second.value){
                res.insertLast(first.value);
                first=first.next;
            }
            else{
                res.insertLast(second.value);
                second=second.next;
            }
        }
        while(first!=null){
            res.insertLast(first.value);
            first=first.next;
        }
        while(second!=null){
            res.insertLast(second.value);
            second = second.next;
        }
        return res;
    }

    protected class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
