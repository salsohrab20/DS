package com.practice.linked_list.practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class LLToStackAdapter {
    //Stack-> Insertion,Removal both from one end -O(1)
    //two combination -> gf,rf,if OR gl,rl,il (i->insert,g->get,r->remove | f->first,l->last)
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

    private static class LL{
       private LinkedList<Integer> linkedList;

        public LL() {
           linkedList=new LinkedList<>();
        }

        public int size(){
            return linkedList.size();
        }

        public void push(int val){
            linkedList.addFirst(val);
        }

        public Integer pop(){
          return  linkedList.removeFirst();
        }
        public Integer peek(){
            return linkedList.getFirst();
        }

    }
}
