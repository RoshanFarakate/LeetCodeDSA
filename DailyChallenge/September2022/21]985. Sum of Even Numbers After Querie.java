class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
     
        int se=0;
        for(int i=0;i<nums.length;i++)
            if(nums[i]%2==0)
                se+=nums[i];
        
        int ans[]=new int[queries.length];
        
        
        for(int i=0;i<queries.length;i++)
        {
            int a=queries[i][0];
            int b=queries[i][1];
            
            if(nums[b]%2==0)
            {
                se-=nums[b];
                nums[b]+=a;
                if(nums[b]%2==0)
                    se+=nums[b];
            }
            else
            {
                nums[b]+=a;
                if(nums[b]%2==0)
                    se+=nums[b];
                
                
            }
            ans[i]=se;
        }
        return ans;
    }
}
