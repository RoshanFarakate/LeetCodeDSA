class Solution {
    public int numIslands(char[][] grid) {
       int count=0;
       int row=grid.length; int colm=grid[0].length;
       for(int i=0; i<row; i++){
         for(int j=0; j<colm; j++){
           if(grid[i][j]=='1'){count++; out(i,j,row,colm,grid);}
         }
       }
       return count; 
    }
    public void out(int i,int j,int row, int colm, char[][] grid){
        if(i<0 || i==row || j<0 || j==colm || grid[i][j]=='0'){ return; }
        grid[i][j]='0'; 
        out(i-1,j,row,colm,grid); out(i+1,j,row,colm,grid); 
        out(i,j+1,row,colm,grid); out(i,j-1,row,colm,grid);
    }
    
}
