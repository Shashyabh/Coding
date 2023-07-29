package com.coding.LinkList;

public class SLL {

    private int size;
    private Node head;
    private Node tail;
    public SLL(){
        this.size=0;
    }
    public class Node{
        int val;
        Node next;
        public Node (int val){
            this.val=val;
        }
        public Node (int val,Node next){
            this.val=val;
            this.next=next;
        }
    }

    public Node insert(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size++;
        return head;
    }

    public void display(Node mid){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("NULL");
    }

    public static Node reverse(Node node){
        Node prev=null;
        Node curr=node;
        Node aft=node.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=aft;
            if(aft!=null){
                aft=aft.next;
            }
        }
        return prev;
    }

    public static Node findMid(Node node){
        Node s=node;
        Node f=node;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public static Node loop(Node head){

        Node slow=head;
        Node fast=head;
        Node curr=head;
        while(fast!=null && fast.next!=null){
            if(slow==fast){
                curr=fast;
            }
            slow=slow.next;
            fast=fast.next.next;
        }

        return curr;
    }


    public static void main(String[] args) {
        Node node=null;

        SLL sl=new SLL();
        node=sl.insert(1);
        node=sl.insert(2);
        //node=sl.insert(3);
        node=sl.insert(0);
        // node=sl.insert(1);
        //sl.insert(3);
        //sl.findMid();
        //sl.findMid(node);
//        System.out.println(sl.findMid(node).val);
//        Node mid=findMid(node);
//        Node head1=reverse(mid);
//        Node temp=node;
//        //head1=head1.next;
//        while(temp!=null &&head1!=null){
//            if(temp.val!=head1.val){
//                System.out.println("Not Pelindrom");
//                break;
//            }
//            temp=temp.next;
//            head1=head1.next;
//        }
//        System.out.println("Pelindrom");

    }
}
