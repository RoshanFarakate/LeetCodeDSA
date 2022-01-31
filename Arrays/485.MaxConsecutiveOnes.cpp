class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int i,n=nums.size(),count=0,res=0;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }
            else{
                count=0;
            }
            res=max(res,count);
        }
        return res;
    }
};
