import java.util.HashMap;
import java.util.Map;

public class Leetcode_3160 {
    public static void main(String[] args) {
       int limit = 4;
       int [][] queries = {{1,4},{2,5}, {1,3}, {3,4}};
        System.out.println(queryResults(limit, queries));
    }

     public static int[] queryResults(int limit, int[][] queries) {
        Map<Integer, Integer> g = new HashMap<>();
        Map<Integer, Integer> cnt = new HashMap<>();
        int m = queries.length;
        int[] ans = new int[m];
        for (int i = 0; i < m; ++i) {
            int x = queries[i][0], y = queries[i][1];
            cnt.merge(y, 1, Integer::sum);
            if (g.containsKey(x) && cnt.merge(g.get(x), -1, Integer::sum) == 0) {
                cnt.remove(g.get(x));
            }
            g.put(x, y);
            ans[i] = cnt.size();
        }
        return ans;
    }
}
