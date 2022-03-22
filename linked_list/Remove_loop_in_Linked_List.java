//https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1
package linked_list;

public class Remove_loop_in_Linked_List {
    class Node {
        int data;
        Node next;
    }

    public static void removeLoop(Node head) {
        Node intersect = detectLoop(head);
        if (intersect == null) return;
        Node loopStarting = findLoopStarting(head, intersect);

        Node curr = loopStarting;

        while (curr.next != loopStarting) {
            curr = curr.next;
        }

        curr.next = null;


    }

    public static Node detectLoop(Node head) {
        Node fast, slow;
        fast = slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return slow;
        }

        return null;
    }

    public static Node findLoopStarting(Node head, Node intersect) {
        Node p1, p2;
        p1 = head;
        p2 = intersect;

        while (p1 != p2) {
            p1 = p1.next;
            p2 = p2.next;
        }

        return p1;
    }
}
