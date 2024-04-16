package com.SystemDesign;

class MyHashSet {
    public class ListNode{
        int key;
        ListNode next;
        public ListNode(int key){
            this.key=key;
        }
    }

    ListNode buckets[];
    private static final int capacity=10000000;
    public MyHashSet(int capacity) {
        buckets=new ListNode[capacity];
    }

    public void add(int key) {
        int hashcode=Integer.hashCode(key);
        ListNode node=buckets[hashcode];
        if(node==null){
            ListNode newNode=new ListNode(key);
            buckets[hashcode]=newNode;
        }
        else{
            while(node!=null){
                if(node.key==key){
                    node.key=key;
                    return;
                }
                node=node.next;
            }
        }
    }

    public void remove(int key) {
        int hashcode=Integer.hashCode(key);
        ListNode node=buckets[hashcode];
        ListNode prev=null;

        while(node!=null){
            if(node.key==key){
                if(prev==null){
                    buckets[hashcode]=node.next;
                }
                else{
                    prev.next=node.next;
                }
                return;
            }
            node=node.next;
        }
    }

    public boolean contains(int key) {
        int hashcode=Integer.hashCode(key);
        ListNode node=buckets[hashcode];
        if(node==null){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MyHashSet set=new MyHashSet(20);
        set.add(5);
        set.add(6);
        set.add(9);
        set.remove(8);
        set.remove(6);
        System.out.println(set.contains(6));

    }
}
