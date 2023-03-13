package com.coding.DSA.LinkList;

public class MerseTwoSortedList {
    public class Node{
        private int val;
        private Node next;

        public Node (int val) {
            this.val = val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void setSize(int size) {
        this.size = 0;
    }

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=head;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("Null");
    }

    public  MerseTwoSortedList merse(MerseTwoSortedList first,MerseTwoSortedList second){
        Node f=first.head;
        Node s=second.head;
        MerseTwoSortedList ans=new MerseTwoSortedList();
        while(f!=null&&s!=null){
            if(f.val<s.val){
                ans.insert(f.val);
                f=f.next;
            }
            else {
                ans.insert(s.val);
                s=s.next;
            }
        }
        while (f!=null){
            ans.insert(f.val);
            f=f.next;
        }
        while (s!=null){
            ans.insert(s.val);
            s=s.next;
        }
        return ans;
    }

    public static void main(String[] args) {
        MerseTwoSortedList sl1=new MerseTwoSortedList();
        MerseTwoSortedList sl2=new MerseTwoSortedList();
        sl1.insert(1);
        sl1.insert(3);
        sl1.insert(5);

        sl2.insert(1);
        sl2.insert(2);
        sl2.insert(9);
        sl2.insert(11);

        MerseTwoSortedList result=new MerseTwoSortedList().merse(sl1,sl2);
        result.display();
    }
}
