class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
 List<List<Integer>> sol = new ArrayList<List<Integer>>();
    
    //sort the nums
    Arrays.sort(nums);
    
    for(int i=0 ; i<nums.length ; i++){
        for(int j=i+1 ; j<nums.length ; j++){
            int k=j+1;
            int l =nums.length-1;
            while(k<l){
                int a = nums[k];
                int b = nums[l];
                int sum = nums[i]+nums[j]+nums[k]+nums[l];
                List<Integer> arr = new ArrayList<Integer>();
                if(sum==target){
                    
                    // if sum of other two values mathced, store it to sol;
                    arr.add(nums[i]);   //0
                    arr.add(nums[j]);   //1
                    arr.add(nums[k]);   //2
                    arr.add(nums[l]);   //3
                    sol.add(arr);
                    
                    //handling duplicates of 3
                    while(k<l && nums[k]==a)
                        k++;
                    
                    //handling duplicates of 4
                    while(k<l && nums[l]==b)
                        l--;                        
                }                    
                else if(sum<target){
                    k++;
                    while(k<l && nums[k]==a)
                        k++;
                }
                else{
                    l--;
                    while(k<l && nums[l]==b)
                        l--;
                }
            }
            
            // handling duplicates of 2
            while(j<nums.length-2 && nums[j]==nums[j+1])
                j++;
        }
        
        //handling duplicates of 1
        while(i<nums.length-1 && nums[i]==nums[i+1])
            i++;
    }
    
    return sol;
}
}
