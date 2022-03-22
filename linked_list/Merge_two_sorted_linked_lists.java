//https://practice.geeksforgeeks.org/problems/merge-two-sorted-linked-lists/1
package linked_list;

public class Merge_two_sorted_linked_lists {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node sortedMerge(Node head1, Node head2) {
        Node merged = new Node(-1);
        Node tail = merged;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                tail = tail.next;
                head1 = head1.next;
            } else {
                tail.next = head2;
                tail = tail.next;
                head2 = head2.next;
            }
        }

        tail.next = head1 == null ? head2 : head1;

        return merged.next;
    }
}
