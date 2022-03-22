//https://practice.geeksforgeeks.org/problems/implement-stack-using-linked-list/1
package linked_list;

public class Implement_Stack_using_Linked_List {
    class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            this.data = data;
        }
    }

    class MyStack {
        StackNode top;

        void push(int a) {
            StackNode node = new StackNode(a);
            node.next = top;
            top = node;
        }

        int pop() {
            int val = -1;
            if (top != null) {
                val = top.data;
                top = top.next;
            }
            return val;
        }
    }
}
