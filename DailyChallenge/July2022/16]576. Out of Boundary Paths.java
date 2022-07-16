class Solution {
    private Long[][][] memo=null;
    private int mod=1000000007;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
        memo=new Long[m+1][n+1][maxMove+1];
        return (int) helpers(m,n,maxMove,startRow,startColumn);
    }
    public long helpers(int m,int n,int maxMove,int row,int col){
        if(maxMove<0) {
            return 0;
        }
        if(row==m||col==n||row<0||col<0){
            return 1;
        }
         if(memo[row][col][maxMove]!=null){
             return memo[row][col][maxMove];
         }
        long total=0;
        long leftmove=helpers(m,n,maxMove-1,row,col-1);
        long rightmove=helpers(m,n,maxMove-1,row,col+1);
        long upmove=helpers(m,n,maxMove-1,row-1,col);
        long downmove=helpers(m,n,maxMove-1,row+1,col);
        total=((leftmove+rightmove+upmove+downmove)%mod);
        memo[row][col][maxMove]=total;
        return total;
    }
    
}
