class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
        this.next=null;
    }
}

public class DP_20_5_Reverse_LinkedList {
    public static void main(String[] args) {
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();

        reverseLinkedList(head);
    }

    public static void reverseLinkedList(Node head){
        Node prev = null;
        Node curr = head;
        while (curr!=null) {
            Node nextNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextNode;
        }

        while(prev!=null){
            System.out.print(prev.val+" ");
            prev=prev.next;
        }
    }
}
