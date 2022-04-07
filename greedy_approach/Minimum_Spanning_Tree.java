//https://practice.geeksforgeeks.org/problems/minimum-spanning-tree/1
package greedy_approach;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair {
    int src, wt;

    public Pair(int src, int wt) {
        this.src = src;
        this.wt = wt;
    }
}

public class Minimum_Spanning_Tree {
    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> q = new PriorityQueue<>((a, b) -> a.wt - b.wt);
        q.add(new Pair(0, 0));
        int sum = 0;

        while (!q.isEmpty()) {
            Pair rem = q.remove();
            if (visited[rem.src]) continue;
            sum += rem.wt;
            visited[rem.src] = true;
            ArrayList<ArrayList<Integer>> neighbour = adj.get(rem.src);
            for (ArrayList<Integer> node : neighbour) {
                int src = node.get(0);
                int wt = node.get(1);
                if (visited[src]) continue;
                q.add(new Pair(src, wt));
            }
        }

        return sum;
    }
}
