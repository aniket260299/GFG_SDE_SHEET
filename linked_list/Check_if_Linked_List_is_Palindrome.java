//https://practice.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/1
package linked_list;

public class Check_if_Linked_List_is_Palindrome {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    boolean isPalindrome(Node head) {
        if (head == null || head.next == null) return true;
        Node fast, slow, prev = null;
        fast = slow = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        Node head2 = slow;
        prev.next = null;

        Node reversed = reverse(head2);

        Node curr1, curr2;
        curr1 = head;
        curr2 = reversed;
        boolean ans = true;
        while (curr1 != null && curr2 != null) {
            if (curr1.data != curr2.data) {
                ans = false;
                break;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }

        prev.next = reverse(reversed);

        return ans;
    }

    Node reverse(Node node) {
        Node reversed = null;

        while (node != null) {
            Node temp = node.next;
            node.next = reversed;
            reversed = node;
            node = temp;
        }

        return reversed;
    }
}
