//https://practice.geeksforgeeks.org/problems/finding-middle-element-in-a-linked-list/1
package linked_list;

public class Finding_middle_element_in_a_linked_list {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    int getMiddle(Node head) {
        Node fast, slow;
        fast = slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}


