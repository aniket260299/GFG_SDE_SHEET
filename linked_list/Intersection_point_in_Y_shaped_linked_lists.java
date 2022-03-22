//https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1/
package linked_list;

public class Intersection_point_in_Y_shaped_linked_lists {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int intersectPoint(Node head1, Node head2) {
        if (head1 == null && head2 == null) return -1;

        Node current = head1;
        int n = 0;
        while (current != null) {
            n++;
            current = current.next;
        }

        current = head2;
        int m = 0;
        while (current != null) {
            m++;
            current = current.next;
        }

        while (n > m) {
            head1 = head1.next;
            n--;
        }

        while (m > n) {
            head2 = head2.next;
            m--;
        }


        while (head1 != null) {
            if (head1 == head2) return head1.data;
            head1 = head1.next;
            head2 = head2.next;
        }

        return -1;
    }
}
