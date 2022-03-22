//https://practice.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1
package linked_list;

public class Add_two_numbers_represented_by_linked_lists {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node addTwoLists(Node first, Node second) {
        Node reversed1 = reverse(first);
        Node reversed2 = reverse(second);
        int carry = 0;
        Node head = null;

        while (reversed1 != null || reversed2 != null || carry > 0) {
            int sum = 0;
            if (reversed1 != null) {
                sum += reversed1.data;
                reversed1 = reversed1.next;
            }

            if (reversed2 != null) {
                sum += reversed2.data;
                reversed2 = reversed2.next;
            }

            sum += carry;
            carry = sum / 10;

            Node temp = new Node(sum % 10);
            if (head != null) temp.next = head;
            head = temp;
        }

        return head;
    }

    static Node reverse(Node node) {
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
