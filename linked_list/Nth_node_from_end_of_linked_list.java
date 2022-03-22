//https://practice.geeksforgeeks.org/problems/nth-node-from-end-of-linked-list/1
package linked_list;

public class Nth_node_from_end_of_linked_list {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int getNthFromLast(Node head, int n) {
        Node curr = head;
        while (curr != null && n != 0) {
            curr = curr.next;
            n--;
        }

        if (n != 0) return -1;

        while (curr != null) {
            head = head.next;
            curr = curr.next;
        }

        return head.data;
    }
}
