class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        return fibDP(n,dp);
    }
    public static int fibDP(int n, int dp[]){
        if(n==0)
            return 0;
        else if(n<=2)
            return 1;
        if(dp[n]!=0)
            return dp[n];
        dp[n]=fibDP(n-1,dp)+fibDP(n-2,dp);
        return dp[n];
    }
}
