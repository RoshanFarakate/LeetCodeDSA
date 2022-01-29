class Solution {
public:
    int countElements(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(),nums.end());
        
        int min = nums[0];
        int max = nums[n-1];
        int count = 0;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i]>min && nums[i]<max)
            {
                count++;
            }
        }
        return count;
    }
};
