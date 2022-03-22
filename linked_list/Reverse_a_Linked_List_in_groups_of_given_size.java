//https://practice.geeksforgeeks.org/problems/reverse-a-linked-list-in-groups-of-given-size/1
package linked_list;

public class Reverse_a_Linked_List_in_groups_of_given_size {
    class Node {
        int data;
        Node next;

        Node(int key) {
            data = key;
            next = null;
        }
    }

    public static Node reverse(Node node, int k) {
        if (node == null || node.next == null) return node;
        int K = k;
        Node tail = node;

        Node prev = null;
        while (K > 0 && node != null) {
            Node temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
            K--;
        }

        tail.next = reverse(node, k);
        return prev;
    }
}
