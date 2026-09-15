class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        int rows =  grid.length;
        int cols  = grid[0].length;
        int[][] vis = new int[rows][cols];
        int inf =  Integer.MAX_VALUE;
        int directions[][] = {{-1,0}, {1,0}, {0,-1}, {0,1}};
        Queue<int[]> q  =  new LinkedList<>();

        for(int i=0 ;  i <  rows; i++){
            for(int j=0 ; j< cols;  j++){
                if(grid[i][j] == 0){
                    q.offer(new int[] {i,j});

                }
            }
        }
        if(q.size() == 0) return;
        while(!q.isEmpty()){
            int[] node =  q.poll();
            int row = node[0];
            int col =  node[1];
            for(int i=0 ;  i < 4;  i++){
                int nr =  row + directions[i][0];
                int nc = col + directions[i][1];
                if(nr>=0 && nc >=0 && nr< rows && nc<cols && grid[nr][nc] == inf){
                    q.add(new int[] {nr, nc});
                    grid[nr][nc] =  grid[row][col] +1;

                }
            }




        }
    }
}
