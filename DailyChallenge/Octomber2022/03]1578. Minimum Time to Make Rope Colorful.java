

class Solution {
    public int minCost(String s, int[] cost) {
        char[] c = s.toCharArray();
        if (c.length == 0 || c.length == 1) return 0;
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            if (isDistinct(i, c)) continue;
            int j = i;
            while (j + 1 < c.length && c[j] == c[j + 1]){
                j++;
            }
            count += helper(i, j, c, cost);
            i = j;
        }
        return count;
    }
    private boolean isDistinct(int i, char[] c) {
        if (i == 0 && i + 1 < c.length) {
            return c[i] != c[i + 1];
        } else if (i == c.length - 1 && i - 1 >= 0) {
            return c[i] != c[i - 1];
        } else {
            return c[i] != c[i-1] && c[i] != c[i+1];
        }
    }
    private int helper (int start, int end, char[] c, int[] cost) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int k = start; k <= end; k++) {
            pq.offer(cost[k]);
        }
        int count = end - start;
        int res = 0;
        while (count > 0) {
            res += pq.poll();
            count--;
        } 
        return res;
    }
}
