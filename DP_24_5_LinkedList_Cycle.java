public class DP_24_5_LinkedList_Cycle {
    public static void main(String[] args) {
        Node head = new Node(3);
        head.next = new Node(2);
        head.next.next = new Node(0);
        head.next.next.next = new Node(4);
        head.next.next.next.next = head.next;

        boolean ans = linkedlistCycle(head);
        System.out.println(ans);
    }

    public static boolean linkedlistCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(fast==slow){
                return true;
            }
        }

        return false;

    }
}
