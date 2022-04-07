//https://practice.geeksforgeeks.org/problems/huffman-decoding-1/1
package greedy_approach;

public class Huffman_Decoding_1 {
    class minHeapNode {
        char data;
        int freq;
        minHeapNode left, right;

        public minHeapNode(char data, int freq) {
            left = right = null;
            this.data = data;
            this.freq = freq;
        }
    }

    String decodeString(minHeapNode root, String encodedStr) {
        StringBuilder ans = new StringBuilder();
        minHeapNode curr = root;
        int n = encodedStr.length();
        for (int i = 0; i < n; i++) {
            char data = encodedStr.charAt(i);

            if (data == '0') curr = curr.left;
            else curr = curr.right;

            if (curr.left == null && curr.right == null) {
                ans.append(curr.data);
                curr = root;
            }
        }
        return ans.toString();
    }
}
