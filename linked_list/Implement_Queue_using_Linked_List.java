//https://practice.geeksforgeeks.org/problems/implement-queue-using-linked-list/1
package linked_list;

public class Implement_Queue_using_Linked_List {
    class QueueNode {
        int data;
        QueueNode next;

        QueueNode(int a) {
            data = a;
            next = null;
        }
    }

    class MyQueue {
        QueueNode front, rear;

        MyQueue() {
            front = rear = null;
        }

        void push(int a) {
            QueueNode node = new QueueNode(a);
            if (front == null) {
                front = rear = node;
            } else {
                rear.next = node;
                rear = node;
            }
        }

        int pop() {
            int val = -1;
            if (front != null) {
                val = front.data;
                front = front.next;
            }
            return val;
        }
    }
}
