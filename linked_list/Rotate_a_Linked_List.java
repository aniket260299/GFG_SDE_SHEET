//https://practice.geeksforgeeks.org/problems/rotate-a-linked-list/1
package linked_list;

public class Rotate_a_Linked_List {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public Node rotate(Node head, int k) {
        if (head == null || head.next == null) return head;

        Node curr = head;
        Node kth = null;
        int count = 1;
        while (curr.next != null) {
            if (count == k) kth = curr;
            curr = curr.next;
            count += 1;
        }

        if (k == count) return head;

        Node temp = kth.next;
        kth.next = null;
        curr.next = head;
        head = temp;
        return head;
    }
}
