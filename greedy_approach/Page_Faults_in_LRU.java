//https://practice.geeksforgeeks.org/problems/page-faults-in-lru/0
package greedy_approach;

import java.util.HashMap;

public class Page_Faults_in_LRU {
    static class Node {
        int data;
        Node prev, next;

        public Node(int data) {
            this.data = data;
            this.prev = this.next = null;
        }
    }

    static void addAfterHead(Node head, Node node) {
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
    }

    static void deleteNode(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    static int pageFaults(int N, int C, int pages[]) {
        Node head = new Node(-1);
        Node tail = new Node(-1);
        head.next = tail;
        tail.prev = head;

        int fault = 0;
        HashMap<Integer, Node> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = pages[i];
            if (map.containsKey(key)) {
                Node node = map.get(key);
                deleteNode(node);
                addAfterHead(head, node);
            } else {
                if (map.size() == C) {
                    Node delete = tail.prev;
                    deleteNode(delete);
                    map.remove(delete.data);
                }
                Node node = new Node(key);
                addAfterHead(head, node);
                map.put(key, node);
                fault++;
            }
        }

        return fault;
    }
}
