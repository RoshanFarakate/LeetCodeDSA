class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1])
                return nums[i];
        }

        return -1;
    }
}

//best way is to sort the array and find num[i]==num[i-1].
