package linkedList;

public class LinkedListNode {
    LinkedListNode next = null;
    int data;

    public LinkedListNode(int d) {
        data = d;
    }

    void appendToTail(int d) {
        LinkedListNode end = new LinkedListNode(d);
        LinkedListNode n = this;
        while (n.next != null) {
            n = next;
        }
        n.next = end;
    }

    LinkedListNode deleteNode(LinkedListNode head, int d) {
        LinkedListNode n = head;

        if (n.data == d) {
            return head.next;
        }

        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
}
