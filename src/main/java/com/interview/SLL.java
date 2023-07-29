package com.interview;

class Node{
    int val;
    Node next;
    public Node(int val) {
        this.val = val;
        this.next=null;
    }
}
public class SLL {
    public static void display(Node root){
        Node temp=root;
        while (temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void findLoopNode(Node head){
        Node slow=head;
        Node fast=head;
        Node curr=head;
        while(fast!=null && fast.next!=null){

            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }

        while (curr!=slow){
            curr=curr.next;
            slow=slow.next;
        }

        Node temp=fast;
        do {
            temp=temp.next;
            slow=slow.next;
        }
        while (temp!=curr);
        slow.next=null;
    }


    public static void main(String[] args) {
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        Node node5=new Node(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        node5.next=node3;
        findLoopNode(node1);
        display(node1);
    }
}

