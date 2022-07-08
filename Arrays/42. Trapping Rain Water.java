class Solution {
    public int trap(int[] height) {
        int res = 0;
        int start = 0;
        int end  = height.length-1;
        while(start<end){
            if(height[start] <= height[end]){
                int cur = height[start];
                while(height[++start]<cur){
                    res += cur - height[start];
                }
            }
            else{
                int cur = height[end];
                while(height[--end]<cur){
                    res += cur - height[end]; 
                }
            }
        }
        return res;
    }
}
