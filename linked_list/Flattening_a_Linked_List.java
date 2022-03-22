//https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1
package linked_list;

public class Flattening_a_Linked_List {
    class Node {
        int data;
        Node next;
        Node bottom;

        Node(int d) {
            data = d;
            next = null;
            bottom = null;
        }
    }

    Node flatten(Node root) {
        Node curr = root;
        Node bottom = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = null;
            bottom = mergeBottom(bottom, curr);
            curr = temp;
        }

        return bottom;
    }

    Node mergeBottom(Node bottom1, Node bottom2) {
        Node result = new Node(-1);
        Node tail = result;
        while (bottom1 != null && bottom2 != null) {
            if (bottom1.data <= bottom2.data) {
                tail.bottom = bottom1;
                tail = bottom1;
                bottom1 = bottom1.bottom;
            } else {
                tail.bottom = bottom2;
                tail = bottom2;
                bottom2 = bottom2.bottom;
            }
        }

        tail.bottom = bottom1 == null ? bottom2 : bottom1;
        return result.bottom;
    }
}
