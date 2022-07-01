class Solution {
    public int dominantIndex(int[] nums) {
        int maxNum=Integer.MIN_VALUE, index=-1; 

        //find the max and index of max element
        for(int i=0;i<nums.length;i++){
            if(maxNum < nums[i]){
                maxNum = nums[i];
                index = i;
            }
        }
       
	    //Check if the array elem is twice than nums[i]
        for(int i=0;i<nums.length;i++){
            if(2*nums[i] > maxNum && i!=index)
                return -1;
        }
        
        return index;
    }
}
