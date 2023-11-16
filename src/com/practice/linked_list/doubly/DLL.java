package com.practice.linked_list.doubly;

public class DLL {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node node = new Node(value);
        node.prev = temp;
        temp.next = node;
        node.next = null;
        tail = node;
        size++;
    }

    public void insertAfter(int after,int val){
        Node p = find(after);
        if(p==null){
            System.out.println("Does not exist");
        }
        Node node = new Node(val);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
    }

    private Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void reverse() {
        reverseUsingRecursion(head);
    }

    private void reverseUsingRecursion(Node head) {
        Node temp = head;
        if (temp == null) {
            return;
        }
        reverseUsingRecursion(head.next);
        System.out.print(temp.value+"-> ");
    }

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }
}
