//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list/1
package linked_list;

public class Reverse_a_linked_list {
    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    Node reverseList(Node head) {
        Node prev, curr;
        prev = null;
        curr = head;

        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
