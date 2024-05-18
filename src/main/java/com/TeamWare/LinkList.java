package com.TeamWare;


public class LinkList {

    public class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }

        public Node (Node next,int val){
            this.next=next;
            this.val=val;
        }
    }

    private Node head;
    private Node tail;

    public void insert(int val){
        Node node=new Node(val);
        if(head==null){
            head=tail=node;
        }
        tail.next=node;
        tail=node;
    }

    public void removeFromBeg(){
        if(head==null){
            return;
        }
        head=head.next;
    }

    public void removeFromEnd(){
        Node temp=head;
        while (temp.next!=tail){
            temp=temp.next;
        }
        temp.next=null;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
            //count++;
        }
        System.out.println("Null");
    }

    public void findNthNode(int n){
        int count=1;
        Node temp=head;
        while (count!=n){
            temp=temp.next;
            count++;
        }
        System.out.println(n+"th Node is : "+temp.val);
    }

    public void removeNthNode(int n){
        int count=1;
        Node temp=head;
        Node prev=head;
        while (count!=n){
            prev=temp;
            temp=temp.next;
            count++;
        }
        prev.next=temp.next;
        System.out.println("Removed node is :"+temp.val);
    }

    public void nthNodeFromLast(int n){
//        int len=0;
//        Node temp=head;
//        while (temp!=null){
//            temp=temp.next;
//            len++;
//        }
//        int len1=len-n+1;
//        findNthNode(len1);
        Node fast=head;
        Node slow=head;
        for (int i = 0; i < n; i++) {
            fast=fast.next;
        }

        while (fast!=null){
            fast=fast.next;
            slow=slow.next;
        }
        System.out.println(n+"rd Node from last is : "+slow.val);
    }

    public static void main(String[] args) {
        LinkList sll=new LinkList();
        sll.insert(5);
        sll.insert(6);
        sll.insert(39);
        sll.insert(66);
        sll.insert(45);
        sll.insert(16);
        sll.insert(8);
        sll.display();
        sll.nthNodeFromLast(3);
//        sll.findNthNode(4);
//        sll.removeNthNode(4);
//        sll.display();

//        sll.removeFromBeg();
//        sll.display();
//        sll.removeFromEnd();
//        sll.display();
    }
}
