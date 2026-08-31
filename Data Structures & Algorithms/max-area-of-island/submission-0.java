class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        boolean[][] vis = new boolean[row][col];

        int[][] direction = {
            {-1, 0},
            {1, 0},
            {0, 1},
            {0, -1}
        };

        int maxArea = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {

                if (grid[i][j] == 1 && !vis[i][j]) {

                    Queue<int[]> queue = new LinkedList<>();

                    queue.offer(new int[]{i, j});
                    vis[i][j] = true;
                    int area = 1;

                    while (!queue.isEmpty()) {

                        int[] cell = queue.poll();

                        int x = cell[0];
                        int y = cell[1];

                        for (int[] dir : direction) {

                            int nx = x + dir[0];
                            int ny = y + dir[1];

                            if (nx >= 0 && nx < row &&
                                ny >= 0 && ny < col &&
                                grid[nx][ny] == 1 &&
                                !vis[nx][ny]) {

                                vis[nx][ny] = true;
                                area++;
                                queue.offer(new int[]{nx, ny});
                            }
                        }
                    }

                    maxArea = Math.max(maxArea, area);

                }
            }
        }

        return maxArea;
        
    }
}
