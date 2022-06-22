class Solution {
    public int findKthLargest(int[] nums, int k) {
    int res=0;
	Arrays.sort(nums);
	if(nums.length>=k)
	  res= nums[nums.length-k];
	 return res;
    }
}
