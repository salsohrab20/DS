package com.practice.linked_list.practice;

import java.util.LinkedList;
public class LLToQueueAdapter {
    public static void main(String[] args) {
        LL linkList = new LL();
        linkList.push(12);
        linkList.push(23);
        linkList.push(45);
        linkList.push(4);

        System.out.println(linkList.size());
        System.out.println(linkList.peek());
        System.out.println(linkList.pop());
        System.out.println(linkList.size());
        System.out.println(linkList.peek());

        linkList.push(78);

        System.out.println(linkList.size());
        System.out.println(linkList.peek());
    }

    private static class LL {
        private LinkedList<Integer> linkedList;

        public LL() {
            linkedList = new LinkedList<>();
        }

        public int size() {
            return linkedList.size();
        }

        public void push(int val) {
            linkedList.addLast(val);
        }

        public Integer pop() {
            return linkedList.removeFirst();
        }

        public Integer peek() {
            return linkedList.getFirst();
        }
    }
}
