class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int curr_count=1, n = nums.length;
        int max_count = 1,res=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]==nums[i-1]){
                curr_count++;
            }
            else{
                if(curr_count> max_count){
                    max_count = curr_count;
                    res = nums[i-1];
                }
                curr_count =1;
            }

        }
        if(curr_count>max_count){
                max_count = curr_count;
                res = nums[n-1];
            }
            return res;
    }
}
