//https://practice.geeksforgeeks.org/problems/largest-number-possible/0
package greedy_approach;

public class Largest_number_possible {
    static String findLargest(int N, int S) {
        if ((S == 0 && N > 1) || S > N * 9) return "-1";
        StringBuilder result = new StringBuilder();
        while (N > 0) {
            if (S >= 9) {
                result.append('9');
                S -= 9;
            } else if (S > 0) {
                result.append(Integer.valueOf(S));
                S = 0;
            } else {
                result.append('0');
            }
            N--;
        }
        return result.toString();
    }
}
