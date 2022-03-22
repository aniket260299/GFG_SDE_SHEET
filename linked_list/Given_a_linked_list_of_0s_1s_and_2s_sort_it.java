//https://practice.geeksforgeeks.org/problems/given-a-linked-list-of-0s-1s-and-2s-sort-it/1
package linked_list;

public class Given_a_linked_list_of_0s_1s_and_2s_sort_it {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node segregate(Node node) {
        Node[] head = new Node[3];
        Node[] tail = new Node[3];
        Node curr = node;
        while (curr != null) {
            Node next = curr.next;
            curr.next = null;

            int idx = curr.data;
            if (head[idx] == null) {
                head[idx] = tail[idx] = curr;
            } else {
                tail[idx].next = curr;
                tail[idx] = curr;
            }

            curr = next;
        }

        Node sortedHead, sortedTail;
        sortedHead = sortedTail = null;
        for (int i = 0; i < 3; i++) {
            if (head[i] != null) {
                if (sortedHead == null) {
                    sortedHead = head[i];
                    sortedTail = tail[i];
                } else {
                    sortedTail.next = head[i];
                    sortedTail = tail[i];
                }
            }
        }

        return sortedHead;
    }
}
