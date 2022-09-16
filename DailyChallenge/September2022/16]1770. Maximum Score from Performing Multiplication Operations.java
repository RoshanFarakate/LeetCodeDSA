class Solution {
    public int maximumScore(int[] nums, int[] multipliers) {
        Integer[][] DP = new Integer[multipliers.length + 1][multipliers.length + 1]; 
        return getMaxScore(nums, 0, nums.length - 1, multipliers, 0, DP);
    }
    
    int getMaxScore(int[] n, int left, int right, int[] m, int i, Integer[][] DP) {
        if (i == m.length) return 0;
        if (DP[left][n.length - right] == null) {
            int path1 = (n[left] * m[i]) + getMaxScore(n, left + 1, right, m, i + 1, DP);
            int path2 = (n[right] * m[i]) + getMaxScore(n, left, right - 1, m, i + 1, DP);
            DP[left][n.length - right] = Math.max(path1, path2);    
        }
        return DP[left][n.length - right];
    }
}
