//https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1
package linked_list;

public class Pairwise_swap_of_a_linked_list {
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    public Node pairwiseSwap(Node head) {
        if (head == null || head.next == null) return head;
        Node newHead = head.next;
        Node remaining = head.next.next;
        newHead.next = head;
        head.next = pairwiseSwap(remaining);
        return newHead;
    }
}
