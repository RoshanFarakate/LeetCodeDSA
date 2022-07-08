class Solution {
    public int uniquePaths(int m, int n) {
        int N=m+n-2;// total number of steps  to reach end
        int r=n-1;// selecting the fixed one;
        double ans=1.0;
        for(int i=1;i<=r;i++){//nCr fomrula
            ans=(ans*(N-r+i))/(i);
        }
        return (int)ans;
    }
}
