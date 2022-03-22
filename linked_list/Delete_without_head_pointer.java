//https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1
package linked_list;

public class Delete_without_head_pointer {
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    void deleteNode(Node del) {
        int nextData = del.next.data;
        del.data = nextData;
        del.next = del.next.next;
    }
}
