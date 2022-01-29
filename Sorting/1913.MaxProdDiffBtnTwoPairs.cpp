class Solution {
public:
    int maxProductDifference(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        
        int a = nums.size();
        int n = (nums[0]*nums[1]);
        int m = (nums[a-1]*nums[a-2]);
        
        return (m-n);
    }
};
// first sort array, multiply first two nums and save it to one int, similarly multiply last two numbers and save it to one int now return the diffrence 
