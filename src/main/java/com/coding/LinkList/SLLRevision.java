package com.coding.LinkList;

public class SLLRevision {

    public class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node (int val,Node next){
            this.next=next;
            this.val=val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void setSize(int size) {
        this.size = size;
    }


    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        tail=node;
        size++;
    }

    int count=0;
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
            count++;
        }
        System.out.println("Null");
    }

    public void displayMidElement(){
        if(count<2){
            System.out.println(head.val);
        }
        Node temp=head;
        for (int i = 0; i < count; i++) {
            if(i==count/2){
                System.out.println(temp.val);
            }
            temp=temp.next;
        }
    }

    public void displayMidByFastAndSlow(){
        Node fast=head;
        Node slow=head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(slow.val);
    }

    public void ReversionOnLinkList(){
        Node curr=head;
        Node prev=null;
        Node next=head.next;

        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=next;
            if (next!=null){
                next=next.next;
            }
        }
        head=prev;
    }

    public static void main(String[] args) {
        SLLRevision sl=new SLLRevision();
        sl.insert(5);
        sl.insert(7);
        sl.insert(12);
        sl.insert(1);
        sl.insert(18);
       // sl.insert(53);
        sl.display();
        sl.displayMidElement();
        sl.displayMidByFastAndSlow();
        sl.ReversionOnLinkList();
        sl.display();
    }
}
