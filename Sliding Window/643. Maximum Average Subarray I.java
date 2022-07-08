class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int res=0;
        int start=k;
        int end = 0;
        int n = nums.length;
        for(int i=0;i<k;i++){
            res+=nums[i];
        }
        int max = res;
        for(int i=0;i<n-k;i++){
            res+= nums[start++]-nums[end++];
            max = Math.max(max,res);
        }
        return (max*1.0/k);
    }
}

