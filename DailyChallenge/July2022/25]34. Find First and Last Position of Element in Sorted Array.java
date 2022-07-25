class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int floor = -1; // first occurence
        int ceil = -1; // last occurence
        // for floor
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                right = mid-1;
                floor = mid;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        // for ceil
        left = 0;
        right = nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                left = mid+1;
                ceil = mid;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return new int[]{floor, ceil};
    }
}
