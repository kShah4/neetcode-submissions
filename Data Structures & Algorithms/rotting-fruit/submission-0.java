class Solution {
    public int orangesRotting(int[][] grid) {
        int rows  = grid.length;
        int cols =  grid[0].length;
        int fresh =0;
        int dir[][] =  {{-1,0},{1,0}, {0,-1},{0,1}};
        
        Queue<int[] >  q  = new LinkedList<>();

        for(int i =0 ;  i < rows;  i++){
            for(int j=0 ; j < cols; j++){
                if(grid[i][j] == 1){
                    fresh++;

                }
                if(grid[i][j] ==2){
                    q.add(new int[] {i,j});

                }
            }

        }

        int time =0;
        while(fresh>0  && !q.isEmpty()){
            int length = q.size();
            for(int i =0;  i < length;  i++){
                int[] curr =  q.poll();
                int row =  curr[0];
                int col =  curr[1];
                for(int j=0 ; j < 4; j++){
                    int nr =  row + dir[j][0];
                    int nc =  col +  dir[j][1];
                    if(nr>=0 && nc>=0 && nr < rows && nc<cols && grid[nr][nc] == 1){
                        grid[nr][nc] =2;
                        q.add(new int [] {nr, nc});
                        fresh--;
                    }
                }
            }
            time++;
        }

        return fresh == 0 ? time : -1;
        
    }
}
