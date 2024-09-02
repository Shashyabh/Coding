package BossCoder.Linklist;

public class SingleLinkList {

    public Node head;
    class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void createLinkList(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
        }
        else{
            Node node=head;
            while (node.next!=null){
                node=node.next;
            }
            node.next=temp;
        }
    }

    public int middleOfLinkList(){

        Node slow=head;
        Node fast=head;

        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        System.out.println(slow.val);
        return slow.val;
    }

    public void displayLinkList(Node head){
        Node node=head;
        while (node!=null){
            System.out.print(node.val+"->");
            node=node.next;
        }
        System.out.println("Null");
    }

    public Node reverseLinkList(Node head){

        Node curr=head;
        Node prev=null;
        Node aft=curr.next;

        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=aft;
            if(aft!=null){
                aft=aft.next;
            }
        }
        head=prev;

        return prev;
    }


    public void detectLoop(){
        Node slow=head;
        Node fast=head;

        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                System.out.println("This Link-List has cycle ");
                break;
            }
        }
        System.out.println("This Link-List has not cycle ");
    }

    public void isPalindrome(){
        Node slow=head;
        Node fast=head;

        boolean flag=false;

        while(fast!=null &&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        Node temp1=slow.next;
        slow.next=null;
        Node node=head;
        Node temp=reverseLinkList(temp1);
        displayLinkList(temp);
        while (temp!=null){
            if (node.val!=temp.val){
                flag=true;
                break;
            }
            temp=temp.next;
            node=node.next;
        }
        if(flag){
            System.out.println("Not Palindrome");
        }
        else{
            System.out.println("Palindrome");
        }
    }

    public static void main(String[] args) {
        SingleLinkList sll=new SingleLinkList();
        sll.createLinkList(2);
        sll.createLinkList(3);
        sll.createLinkList(8);
        sll.createLinkList(9);
        sll.createLinkList(8);
        sll.createLinkList(3);
        sll.createLinkList(2);
        //sll.createLinkList(11);
        sll.displayLinkList(sll.head);
        sll.isPalindrome();
//        sll.middleOfLinkList();
//        sll.reverseLinkList();
//        sll.displayLinkList();
        //sll.detectLoop();
    }
}
