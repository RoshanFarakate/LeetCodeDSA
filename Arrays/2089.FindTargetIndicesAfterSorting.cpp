class Solution {
public:
    vector<int> targetIndices(vector<int>& nums, int target) {
        int count=0, rank=0;
        vector<int> ans;
        for(int n : nums)
        {
            count += n==target;
            rank += n<target;
        }
        while(count--)  
            ans.push_back(rank++);
            return ans;
    }
};
