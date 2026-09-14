class Solution {
    public int numIslands(char[][] grid) {
        int rows  =  grid.length;
        int cols =  grid[0].length;
        int[][] vis  =  new int[rows][cols];

        int [][] delta = {{1,0}, {-1, 0}, {0, 1},  {0,-1}};
        int count = 0;
        for(int i =0  ;  i < rows; i++){
            for(int j=0 ; j <cols ; j++){
                if(vis[i][j] !=1 && grid[i][j] == '1' ){
                    count++;
                    dfs(i , j , grid, vis, delta);
                }
            }
        }


        return count;
        
    }

    public void dfs(int row , int col  , char[][] grid ,  int[][] vis, int [][] delta){
        vis[row][col] = 1;
        for(int i =0 ;  i < delta.length; i++){
            int nrow =  row+ delta[i][0];
            int ncol =  col+ delta[i][1];
            if( nrow>=0 && nrow < grid.length && ncol>=0 && ncol < grid[0].length && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1' ){
                dfs(nrow, ncol, grid, vis, delta);
            }
        }


    }
}